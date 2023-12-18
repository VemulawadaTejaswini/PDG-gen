import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int h =sc.nextInt();
		int count=1;
		
		for(int i=1;i<N;i++) {
			int j=sc.nextInt();
			if(j>=h) {
				count++;
				h=j;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
