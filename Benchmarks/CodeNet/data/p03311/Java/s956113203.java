import java.util.*;

public class Main{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		int tmp;
		long ans = 0;
		
		for(int i=0; i<num; i++){
			tmp = sc.nextInt();
			//a[i] = tmp;	
			a[i] = tmp-(i+1);	
		}

		Arrays.sort(a);
	
		for(int i=0; i<num; i++){
			ans += (long)Math.abs(a[i] - a[num/2]);
		}
		
		System.out.println(ans);
		
	}

}