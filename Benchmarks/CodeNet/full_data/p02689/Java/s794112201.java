import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
    Integer[] H = new Integer[N];
    for(int j = 0 ; j < N ; j++){
        H[j] = sc.nextInt();
    }
      
    Set<Integer> warui = new HashSet<>();
    for(int i = 0 ; i < M ; i++){
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      if(H[a] <= H[b])
        warui.add(a);
      if(H[b] <= H[a])
        warui.add(b);        
    }
	
	System.out.println(N - warui.size());
	}
}