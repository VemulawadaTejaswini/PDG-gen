import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    int M = sc.nextInt();
    Integer[] ai = new Integer[N];
    Integer sum = 0;
    for(int i=0; i < N; i++){
      ai[i] = sc.nextInt();
      sum += ai[i];
    }
    Integer limit = (int) Math.floor(sum/(4*M));
    Arrays.sort(ai, Collections.reverseOrder());
    
    if(ai[M-1] > limit){
      System.out.println("Yes");
      return;
    }
    
    System.out.println("No");
    return;
  }
}
