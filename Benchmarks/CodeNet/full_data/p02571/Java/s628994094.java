import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();

        int matchCnt = 0;
        int maxMatchCnt = 0;
        for(int i=0; i<t.length(); i++) {
            for(int j=0; j<s.length(); j++) {
                if(t.charAt(i) == s.charAt(j)) {
                    matchCnt++;
                    maxMatchCnt = Math.max(maxMatchCnt, matchCnt);
                    break;
                } else {
                    matchCnt = 0;
                }
            }
        }
        System.out.println(t.length()-maxMatchCnt);
    }
}
