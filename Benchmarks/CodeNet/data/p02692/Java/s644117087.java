import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); int a = scan.nextInt(); int b = scan.nextInt(); int c = scan.nextInt();
        scan.nextLine();
        String[] str = new String[n];
        char[] ans = new char[n];

        for (int i = 0; i < n; ++i) str[i] = scan.nextLine();

        for (int i = 0; i < n; ++i) {
            String s = str[i];


            if (s.charAt(0)=='A' && s.charAt(1)=='B') {
                if (a == b && a==1) {
                    if (i+1 < n) {
                        String t = str[i+1];
                        int[] cnt = new int[3];
                        for (int j = 0; j < 2; j++) {
                            cnt[s.charAt(j)-'A']++;
                            cnt[t.charAt(j)-'A']++;
                        }

                        if (cnt[0] >= 2) {
                            a++;
                            b--;
                            ans[i] = 'A';
                        }
                        else if (cnt[1] >= 2) {
                            a--;
                            b++;
                            ans[i] = 'B';
                        }
                        continue;
                    }
                }
                if (a > b) {
                    a--;
                    b++;
                    ans[i] = 'B';
                }
                else {
                    a++;
                    b--;
                    ans[i] = 'A';
                }
            }
            else if (s.charAt(0)=='A' && s.charAt(1)=='C') {
                if (a == c && a==1) {
                    if (i+1 < n) {
                        String t = str[i+1];
                        int[] cnt = new int[3];
                        for (int j = 0; j < 2; j++) {
                            cnt[s.charAt(j)-'A']++;
                            cnt[t.charAt(j)-'B']++;
                        }

                        if (cnt[0] >= 2) {
                            a++;
                            c--;
                            cnt[i] = 'A';
                        }
                        else if (cnt[2] >= 2) {
                            a--;
                            c++;
                            cnt[i] = 'C';
                        }
                        continue;
                    }
                }
                if (a > c) {
                    a--;
                    c++;
                    ans[i] = 'C';
                }
                else {
                    a++;
                    c--;
                    ans[i] = 'A';
                }
            }
            else if (s.charAt(0)=='B' && s.charAt(1)=='C') {
                if (b==c && b==1) {
                    if (i+1 < n) {
                        String t = str[i+1];
                        int[] cnt = new int[3];
                        for (int j = 0; j < 2; j++) {
                            cnt[s.charAt(j)-'A']++;
                            cnt[t.charAt(j)-'A']++;
                        }

                        if (cnt[1] >= 2) {
                            b++;
                            c--;
                            cnt[i] = 'B';
                        }
                        else if (cnt[2] >= 2) {
                            b--;
                            c++;
                            cnt[i] = 'C';
                        }

                        continue;
                    }
                }

                if (b > c) {
                    b--;
                    c++;
                    ans[i] = 'C';
                }
                else {
                    b++;
                    c--;
                    ans[i] = 'B';
                }
            }
            if (a < 0 || b < 0 || c < 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for (var e: ans) System.out.println(e);
    }
}