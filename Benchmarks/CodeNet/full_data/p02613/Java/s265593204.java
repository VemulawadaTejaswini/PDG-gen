import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int m = t.length();
        int n = 0;
        for (int i = 0; i < m - 1; i++) {
            n += (t.charAt(i) - '0') * 10;
        }
        n += t.charAt(m - 1) - '0';
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if(s.compareTo("AC") == 0){
                c0 ++;
            }else if(s.compareTo("WA") == 0){
                c1 ++;
            }else if(s.compareTo("TLE") == 0){
                c2 ++;
            }else{
                c3 ++;
            }
        }
        System.out.println("AC x " + c0);
        System.out.println("WA x " + c1);
        System.out.println("TLE x " + c2);
        System.out.println("RE x " + c3);
    }
}