import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {

	static int N,M;
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		List<Integer>[]list=new List[N];
		for(int i=0;i<N;i++){
			list[i]=new LinkedList<Integer>();
		}
		int[] iri = new int[N];
		for(int i=0;i<M;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			list[a].add(b);
			iri[b]++;
		}
		List<Integer>ans=new LinkedList<Integer>();
		boolean f = false;
		for(int t=0;t<N;t++){
			for(int i=0;i<N;i++){
				if(iri[i]==0){
					ans.add(i);
					iri[i]=-1;
					if(!f){
						for(int j=0;j<N;j++){
							if(iri[j]==0){
								f=true;
							}
						}
					}
					for(Integer j:list[i]){
						iri[j]--;
					}break;
				}
			}
		}
		
		for(Integer a:ans){
			System.out.println(a+1);
		}
		System.out.printf("%d\n", f?1:0);
		
	}
	static HashMap<Integer,Integer>rank = new HashMap<Integer,Integer>();
}