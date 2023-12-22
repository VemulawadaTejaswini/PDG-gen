import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] res = new int[n];
        int[] in = new int[n];
        for(int i=0; i<n; i++) {
            String s = sc.next();
            if(s.equals("AB")) {
                in[i] = 2;
            } else if(s.equals("AC")) {
                in[i] = 1;
            }
        }
        boolean success = true;

        for(int i=0; i<n; i++) {
            if(a > 0 && b > 0 && c > 0) {
                go(i, a, b, c, in, res, n);
                break;
            }
            if(in[i] == 0) {
                if(b == 0 && c == 0) {
                    success = false;
                    break;
                }
                if(b == 0) {
                    res[i] = 1;
                    b++;
                    c--;
                    continue;
                }
                if(c == 0) {
                    res[i] = 2;
                    b--;
                    c++;
                    continue;
                }
                if(b == 1 && c == 1) {
                    if(i == n-1) {
                        res[i] = 1;
                        break;
                    }
                    if(in[i+1] == 0 || in[i+1] == 2) {
                        res[i] = 1;
                        b++;
                        c--;
                    } else {
                        res[i] = 2;
                        b--;
                        c++;
                    }
                    continue;
                }
                if(b < c) {
                    res[i] = 1;
                    b++;
                    c--;
                } else {
                    res[i] = 2;
                    b--;
                    c++;
                }
            } else if (in[i] == 1) {
                if(a == 0 && c == 0) {
                    success = false;
                    break;
                }
                if(a == 0) {
                    res[i] = 0;
                    a++;
                    c--;
                    continue;
                }
                if(c == 0) {
                    res[i] = 2;
                    a--;
                    c++;
                    continue;
                }
                if(a == 1 && c == 1) {
                    if(i == n-1) {
                        res[i] = 0;
                        break;
                    }
                    if(in[i+1] == 1 || in[i+1] == 2) {
                        res[i] = 0;
                        a++;
                        c--;
                    } else {
                        res[i] = 2;
                        a--;
                        c++;
                    }
                    continue;
                }
                if(a < c) {
                    res[i] = 0;
                    a++;
                    c--;
                } else {
                    res[i] = 2;
                    a--;
                    c++;
                }
            } else {
                if(a == 0 && b == 0) {
                    success = false;
                    break;
                }
                if(a == 0) {
                    res[i] = 0;
                    a++;
                    b--;
                    continue;
                }
                if(b == 0) {
                    res[i] = 1;
                    a--;
                    b++;
                    continue;
                }
                if(a == 1 && b == 1) {
                    if(i == n-1) {
                        res[i] = 0;
                        break;
                    }
                    if(in[i+1] == 2 || in[i+1] == 1) {
                        res[i] = 0;
                        a++;
                        b--;
                    } else {
                        res[i] = 1;
                        a--;
                        b++;
                    }
                    continue;
                }
                if(a < b) {
                    res[i] = 0;
                    a++;
                    b--;
                } else {
                    res[i] = 1;
                    a--;
                    b++;
                }
            }
        }

        if(success) {
            System.out.println("YES");
            for(int i=0; i<n; i++) {
                System.out.println((char)('A' + res[i]));
            }
        } else {
            System.out.println("NO");
        }
    }

    static void go(int pos, int a, int b, int c, int[] in, int[] res, int n) {
        int[] count = new int[3];
        for(int i=pos; i<n; i++) {
            if(in[i] == 0) {
                if(count[0] %2 == 0) {
                    res[i] = 1;
                } else {
                    res[i] = 2;
                }
            } else if(in[i] == 1) {
                if(count[1] %2 == 0) {
                    res[i] = 2;
                } else {
                    res[i] = 0;
                }
            } else {
                if(count[2] %2 == 0) {
                    res[i] = 0;
                } else {
                    res[i] = 1;
                }
            }
            count[in[i]]++;
        }
    }
}