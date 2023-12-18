import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = 0;
        for(int i=1; i<=5; i+=2) {
            int max = Integer.parseInt(repeat("9", i));
            int min = Integer.parseInt("1"+repeat("0", i-1));
            if(min>n) {
                break;
            }
            if(n<=max) {
                r+=n-min+1;
                break;
            }
            else {
                r+=max-min+1;
            }
        }
        System.out.println(r);
    }
    private static String repeat(String s, int c) {
        if(c<=0) {
            return "";
        }
        // string repeat https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string-in-java
        return new String(new char[c]).replace("\0", s);
    }
}
