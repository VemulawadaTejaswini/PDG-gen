
import java.util.*;
public class Main{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N+1];//cost
		int B[] = new int[N+1];//deadline
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();//initialized
			B[i]=sc.nextInt();//initialized
		}
		
		List<int[]> l = new ArrayList<int[]>();
		for(int i=0;i<N;i++) {
			int tmp[] = {A[i],B[i]};
			l.add(tmp);
		}
		Collections.sort(l,(l1,l2)->l1[1]-l2[1]);
		
		int total=0;
		for(int i=0;i<N;i++) {
			total += l.get(i)[0];
			if(total<=l.get(i)[1]) continue;
			else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		
	}
}
