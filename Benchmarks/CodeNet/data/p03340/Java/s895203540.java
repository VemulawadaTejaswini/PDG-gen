import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A= new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int a=0;
		
		for(int l=0;l<N;l++){
			for(int r=l;r<N;r++){
				int tmp0=0;
				int tmp1=0;
				for(int i=l;i<=r;i++){
					tmp0^=A[i];
					tmp1+=A[i];
				}
				if(tmp0==tmp1){
					a++;
				}
			}
			
		}
		
		System.out.println(a);
	}
}