import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt(), N=sc.nextInt();
		int []T=new int[D];
		int []A=new int[N];
		int []B=new int[N];
		int []C=new int[N];
		int []max=new int[D];
		int result=0;
		int monooki=0;
		for(int i=0;i<D;i++){
			T[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
			B[i]=sc.nextInt();
			C[i]=sc.nextInt();
		}
		for(int a=0;a<D-1;a++){
			for(int i=0;i<N;i++){
				if(T[a]<=B[i]&&T[a]>=A[i]){
					for(int j=0;j<N;j++){
						if(T[a+1]<=B[j]&&T[a+1]>=A[j]){
							if(monooki==C[i]||a==0){
							if(max[a]<=Math.abs(C[j]-C[i])){
								max[a]=Math.abs(C[j]-C[i]);
								monooki=C[j];
							}
							}
						}
					}
				}
			}
			System.out.println(max[a]);
			result=result+max[a];
		}
		System.out.println(result);
	}
}