import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        int count;
        s.nextLine();
        int ac = 0, wa = 0, tle = 0, re = 0; 
        while(testCases-->0) {
            String res = s.nextLine();
            if(res.equals("AC")) ac++;
            if(res.equals("WA")) wa++;
            if(res.equals("TLE")) tle++;
            if(res.equals("RE")) re++;
        }
        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);
    }
}
