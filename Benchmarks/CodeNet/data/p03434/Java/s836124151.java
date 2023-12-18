import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int An[] = new int[N];
		for(int i = 0;i < N;i++){//値取得
			An[i] = sc.nextInt();
		}

		System.out.println(solve(N,An));

	}
	
	private static int solve(int N,int[] An){
       		ArrayList<Integer> an = new ArrayList<>();
		for(int a : An){
		an.add(a);
		}
		//Sorting
     		Collections.sort(an);

		//a & b Max 
		int amax = 0 ,bmax = 0;
		for(int i = 0;i < N;i++){
			if(i % 2 == 0){
			amax += an.get(i);
			}else{
			bmax += an.get(i); 
			}
		}
		
		return Math.abs(amax - bmax);
	
	}
}
