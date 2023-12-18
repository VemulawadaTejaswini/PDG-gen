import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
      int number = 0;
    Integer A[] = new Integer[N];
      for(int i = 0 ; i < N ; i++){
        A[i] = Integer.parseInt(sc.next());
      }
      Integer P[] = new Integer[N];
      Integer Q[] = new Integer[N];
      for(int k = 0 ; k < N ; k++){
        P[k] = A[k] + k;
      }
      for(int j = 0 ; j < N ; j++){
        Q[j] = j - A[j];
      }
      for(int p = 0 ; p < N ; p++){
        for(int q = p + 1 ; q < N ; q++){
        if(P[p].equals(Q[q]))
          number++;
      }
      }
      
	
	System.out.println(number);
	}
}