import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int syou = N/(A+B);
        int amari = N%(A+B);
        int ans = syou*A+amari;

        System.out.println(ans);
	}
}
