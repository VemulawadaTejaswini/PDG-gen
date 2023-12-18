import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Integer> tree=new ArrayList<>(n);
		
		
		for(int i=0; i<n;i++){
			tree.add(sc.nextInt());
		}
		
		Collections.sort(tree);	
		
		
		
		int ans = 1000000000;
		
		for(int i=0;i<n-k+1;i++){
			ans=Math.min(tree.get(i+k-1)-tree.get(i),ans);
		}
			
		System.out.println(ans);
	}

}
