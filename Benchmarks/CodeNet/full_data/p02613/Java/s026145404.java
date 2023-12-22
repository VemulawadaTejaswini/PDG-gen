import java.io.*;
import java.util.Scanner;
public class Main {
    private enum hoge{
        AC,
        WA,
        TLE,
        RE;
    }
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;

        int next = scanner.nextInt();
        for (int i = 0; i <= next; i++) {
            String s = scanner.nextLine();
            if (s.equals(hoge.AC.toString())) {
                ac++;
            }else if(s.equals(hoge.WA.toString())){
                wa++;
            }else if(s.equals(hoge.TLE.toString())){
                tle++;
            }else if(s.equals(hoge.RE.toString())){
                re++;
            }
        }
        scanner.close();
        System.out.println( String.format("AC x %s", ac) );
        System.out.println( String.format("WA x %s", wa) );
        System.out.println( String.format("TLE x %s", tle) );
        System.out.println( String.format("RE x %s", re) );
    }

}