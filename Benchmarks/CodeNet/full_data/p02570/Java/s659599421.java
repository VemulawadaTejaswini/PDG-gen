import java.util.Scanner;

public class Main{
	public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt();
        int T = scan.nextInt();
        int S = scan.nextInt();
        int t = D / S;
        if(D % S == 0)
            ans++;

        System.out.println(
            ans <= T ? "Yes" : "No";
        );
    }
}