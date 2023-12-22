
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int r=cin.nextInt(),c=cin.nextInt();
		
		for(int i=0;i<r;i++) {
			int sum=0;
			for(int j=0;j<c;j++) {
				int x=cin.nextInt();
				System.out.print(x+" ");
				sum+=x;
			}
			System.out.println(sum);
		}
	}
	
}
