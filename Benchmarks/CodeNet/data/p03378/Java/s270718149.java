import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),X=sc.nextInt();
		int[] A=new int[M];
		int cstL=0,cstR=0;
		for(int i=0;i<M;i++){
			A[i]=sc.nextInt();
			if(A[i]<X){
				cstL=cstL+1;
			}else{
				cstR=cstR+1;
			}
		}
		int cst=cstL;
		if(cst>cstR){
			cst=cstR;
		}
		System.out.println(cst);
	}
}
