import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		int[] A=new int[N];
		int[] X=new int[Q];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0;i<Q;i++){
			X[i]=sc.nextInt();
		}
		for(int i=0;i<Q;i++){
			ArrayList<Integer> sa=new ArrayList<Integer>();
			ArrayList<Integer> arrA=new ArrayList<Integer>();
			for(int s=0;s<A.length;s++){
				arrA.add(A[s]);
			}
			for (int j = 0; j < N; j++) {
				sa.add(Math.abs(A[j]-X[i]));
			}
			int taka=0;
			int ao=0;
			int cou=N-1;
			int pos=0;

			for (int k = 0; k < Q; k++) {
				taka += arrA.get(cou);
				arrA.remove(cou);
				sa.remove(cou);
				cou--;
				if(cou==-1)break;
				
				Integer minNumber = sa.stream()
				        .min(Comparator.comparing(j -> j)).get();
				for(int a=0;a<sa.size();a++){
					if(sa.get(a)==minNumber){
						pos=a;
						break;
					}
				}
				ao += A[pos];
				arrA.remove(pos);
				sa.remove(pos);
				cou--;
				if(cou==-1)break;
			}
			System.out.println(taka);
		}
	}
}
