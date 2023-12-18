import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt(), k =sc.nextInt();
		boolean d[] = new boolean[10];
		for(int i=0;i<k;i++){
			int a = sc.nextInt();
			d[a] = true;
		}
		
		while(!ok(n, d)){
			n++;
		}
		System.out.println(n);
	}
	
	static boolean ok(int n, boolean a[]){
		while(n>0){
			if(a[n%10])
				return false;
			n/=10;
		}
		
		return true;
	}
}
