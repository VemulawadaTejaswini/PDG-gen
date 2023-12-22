import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double D = sc.nextInt();
        double T = sc.nextInt();
        double S = sc.nextInt();
        String ans = "No";
        double time = D / S;
        if(time <= T) ans = "Yes";
         System.out.println(ans);
    } 
}