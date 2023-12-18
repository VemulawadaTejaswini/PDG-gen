import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int[] a = new int[A];
		
		int max = 200000;
		
		int ans;
		
		for(int i = 0; i <a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.print(max);
	}
}
