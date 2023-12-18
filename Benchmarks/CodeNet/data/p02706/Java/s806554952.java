import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=0;i<b;i++) {
			int k =sc.nextInt();
			a-=k;
		}
		if(a>=0) {
			System.out.println(a);
		}else {
			System.out.println(-1);
		}
		
		
	}

}
