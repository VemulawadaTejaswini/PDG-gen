import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		int[] set={0,2,5,5,4,5,6,3,7,6};
		
		int[] a=new int[M];
		
		String[] help=new String[N+5];
		
		help[0]="";
		
		for(int i = 0; i<M; i++){
		
			a[i]= sc.nextInt();
		
		}
		
		for(int i = 0; i<=N; i++){
		
			for(int j = 0; j<M; j++){
			
				if(i>=set[a[j]] && help[i-set[a[j]]]!=null){
				
					if(check(help[i-set[a[j]]]+a[j],help[i])){
					
						help[i]=help[i-set[a[j]]]+a[j];
					}
					
				}
				
			}
			
		}
		
		System.out.println(help[N]);
		
	}



	static boolean check(String A,String B){
		if(B==null || A.length()>B.length()){
			return true;
		}
		if(A.length()<B.length()){
			return false;
		}
		return A.length() - B.length()>0;
	}
}