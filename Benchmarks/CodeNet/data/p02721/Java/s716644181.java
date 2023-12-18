import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int C=stdIn.nextInt();
		String a=stdIn.next();
		boolean work[]=new boolean[N];
		int L[]=new int[K];
		int R[]=new int[K];
		int x=0;
		for(int i=0;i<N;i++){
			if(a.charAt(i)=='o')
				work[i]=true;
			else
				work[i]=false;
		}
		for(int i=0;i<N;i++){
			if(work[i]){
				L[x]=i;x++;
				i+=C-1;
			}
			if(x==K)
				break;
		}x--;
		for(int i=N-1;i>=0;i--){
			if(work[i]){
				R[x]=i;x--;
				i-=C-1;
			}
			if(x==-1)
				break;
		}
		for(int i=0;i<K;i++){
			if(L[i]==R[i])
				System.out.println(L[i]+1);
		}
	}
}
