import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int H[]=new int[N];
		boolean key[]=new boolean[N];
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		int ans=0;
		for(int i=0;i<N;i++){
			H[i]=stdIn.nextInt();
			list.add(new ArrayList<Integer>());
		}
		for(int i=0;i<M;i++){
			int A=stdIn.nextInt()-1;
			int B=stdIn.nextInt()-1;
			ArrayList<Integer> C=new ArrayList<Integer>();
			C=list.get(A);C.add(B);list.set(A,C);
			C=list.get(B);C.add(A);list.set(B,C);
		}
		for(int i=0;i<N;i++){
			ArrayList<Integer> C=list.get(i);
			if(key[i]==false)
				for(int j=0;j<C.size();j++){
					if(H[i]<H[C.get(j)]){
						key[i]=true;
						break;
					}
					else
						if(H[i]==H[C.get(j)]){
							key[C.get(j)]=true;
							key[i]=true;
							break;
						}
						else
							key[C.get(j)]=true;
				}
		}
		for(int i=0;i<N;i++){
			if(key[i]==false)
				ans++;
		}
		System.out.println(ans);
	}
}
