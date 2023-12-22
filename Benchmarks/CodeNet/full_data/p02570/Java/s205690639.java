import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();
        String ans = "No";
        if((D / S) <= T) ans = "Yes";
         System.out.println(ans);
    } 
}