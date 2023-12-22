import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int[] B=new int [100];
	boolean bb(int x){
		int d=B[1]-B[0];
		for(int i=1;i<x;i++)if(B[i]-B[i-1]!=d)return false;
		return true;
	}
	void aa(){
		while(true){
			int A=sc.nextInt();
			if(A==0)break;
			int[] D=new int[A+1];
			for(int i=0;i<A+1;i++)D[i]=sc.nextInt();
			for(int i=0;i<A+1;i++){
				int k=0;
				for(int j=0;j<A+1;j++)if(j!=i)B[k++]=D[j];
				if(bb(A))System.out.println(D[i]);
			}
		}
	}
	public static void main(String[]arg){
		new Main().aa();
	}
}