import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		String [] A = new String[N];
		String [] B = new String[M];
		
		for(int i=0;i<N;i++){
			A[i] = sc.next();
			}
		for(int i=0; i<M;i++){
			B[i] = sc.next();
			}
		int a=0;
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				
				if(A[i].indexOf(B[j])!=-1){
					if(i>j){break;}
					a = 1;//部分一致
					}
				else{
				    //部分一致ではない
					}
				}
			}
		if(a==1){
			System.out.println("Yes");
			}
		else{
		 System.out.println("No");
		 }
		}
	}