import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = Integer.parseInt(sc.next());
  int k = Integer.parseInt(sc.next());
  int[] m = new int[n];
  if (k>=n){
  System.out.println(0);
  }
  if(k<n){
      for (int i = 0; i < n; i++){
  	m[i] = Integer.parseInt(sc.next());
  }
    Arrays.sort(m);
    int turn = 0;
  	for(int i = n-1; i > k; i--){
    	m[i] = 0;
    }
    for (int i = 0; i<(n-k); i++){
        	while(m[i] > 0){
            m[i]--;
              turn++;
        }
    }
    System.out.println(turn);
  }
}
}