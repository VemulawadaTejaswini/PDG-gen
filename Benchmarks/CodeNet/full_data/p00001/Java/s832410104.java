import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		for(int i = 0; i < 10; ++ i)a[i] = in.nextInt();
		Arrays.sort(a);
//		int x = 0;
//		int y = 0;
//		int z = 0;
//		for(int  i = 0; i < 10; ++ i){
//			int t = in.nextInt();
//			if(t < x){
//				if(t < y && t > z) z = t;
//				if(t > y){ z= y;y = t;}
//			}else{
//				z = y;
//				y = x;
//				x = t;
//			}
//			
//		}
		System.out.println(a[9] + "\n" + a[8] + "\n" + a[7]); 
	}
}