import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int max=1;
		for(int i=1; i*i<=M; i++){
			if(M%i==0 && i*N<=M){
			max=Math.max(max,i);
			}
		}
		System.out.println(max);
	}
}