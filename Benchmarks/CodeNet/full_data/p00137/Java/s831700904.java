//Volume1-0137
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int n,a;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Case "+(i+1)+":");
			a = sc.nextInt();
			for(int j=0;j<10;j++){
				System.out.println(a = Integer.parseInt(
						String.format("%08d",(int)Math.pow(a,2)).substring(2,6)));
			}
		}
	}
}