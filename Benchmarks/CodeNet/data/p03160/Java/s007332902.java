import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++){
			h[i] = sc.nextInt();
		}
		sc.close();
		int wa = 0;
		int i = 0;
		do{
			int i1 = h[i]-h[i+1];
			if(i1<0) i1 = i1*-1;
			int i2 = i1;
			if(i+2<n){
				i2 = h[i]-h[i+2];
				if(i2<0) i2 = i2*-1;
			}
			if(i1<i2){
				i = i+1;
				wa += i1;
			}else{
				i = i+2;
				wa += i2;
			}
		}while(i<n-1);
		System.out.println(wa);
	}
}
