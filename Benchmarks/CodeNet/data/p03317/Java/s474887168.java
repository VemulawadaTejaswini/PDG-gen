import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		int place = 0;
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			if(a[i]==1)place = i;
		}
		int num = 0;
		num += (place+K-2)/(K-1);
		num += (N-place+K-3)/(K-1);
		System.out.println(num);
	}
}