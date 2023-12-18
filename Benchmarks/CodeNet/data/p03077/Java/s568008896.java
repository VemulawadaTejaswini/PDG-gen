import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long[] k=new long[5];
		for(int i=0;i<5;i++){
			k[i]=sc.nextLong();
		}
		Arrays.sort(k);
		System.out.println(n%k[0]==0?n/a[0]+4:n/a[0]+5);
	}
	
}