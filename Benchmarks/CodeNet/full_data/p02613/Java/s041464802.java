import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
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
            }else if(s.compareTo("RE") == 0){
                c3 ++;
            }
        }
        System.out.println("AC x " + c0);
        System.out.println("WA x " + c1);
        System.out.println("TLE x " + c2);
        System.out.println("RE x " + c3);
    }
}