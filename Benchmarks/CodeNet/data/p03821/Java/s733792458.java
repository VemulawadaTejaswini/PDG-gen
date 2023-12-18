import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int[] a=new int[N];
		int[] b=new int[N];
		long count=0;
		
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		for(int i=N-1;i>0;i--){
			count+=baisuu(a[i],b[i]);
			a[i-1]+=count;
		}
		count+=baisuu(a[0],b[0]);
		
		System.out.println(count);
	}
	
	static int baisuu(int a,int b){
		if(a%b==0) return 0;
		else{
			return b-a%b;
		}
	}
}
