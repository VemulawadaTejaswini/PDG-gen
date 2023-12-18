import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Integer> tree=new ArrayList<>(k);
		
		
		for(int i=0; i<n;i++){
			tree.add(sc.nextInt());
		}
		
		Collections.sort(tree);	
		
		int ans = 10^9;
		
		for(int i=0;i<n-k+1;i++){
			if(tree.get(i+k-1)-tree.get(i)<ans)ans=tree.get(i+k-1)-tree.get(i);
		}
			
		System.out.println(ans);
	}

}
