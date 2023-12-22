import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int x=0;
		int y=0;
		int count=0;
		
		for(int i=0;i<n;i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			if(Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)))<=d) {
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}
}
