import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
 
		long bc = (long)b*c;
		long bd = (long)b*d;
		long ad = (long)a*d;
		long ac = (long)a*c;
		
		long ans = Math.max(bc, Math.max(bd, Math.max(ad, ac)));
		System.out.println(ans);
	}
 
}