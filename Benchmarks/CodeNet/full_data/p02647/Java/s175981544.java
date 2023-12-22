import java.util.*;

public class Main {
	public static void main(String[] args){
      try{
        Scanner sc = new Scanner(System.in);
        Long  N = sc.nextLong();
        Long  K = sc.nextLong();

        String  A_str = sc.nextLine();
        List<Integer> A = new ArrayList();
        for(int i=0; i < A_str.length(); i++){
        	A.add(Integer.parseInt(A_str[i]));
        }

        List<Integer> result = new ArrayList();
        
        for(int i=0; i < K; i++){
            for(int a_i =0; a_i < N; a_i++){
              int p = A.get(a_i);
              int x = a_i - p;
              int y = a_i + p;
              if(x < 0)
                x =0;
              if(y > N -1)
                y = N - 1;

              for( int j =0; j < (y-x); j++){
                result_list.get(j) += 1;
              }
          }
        }
        for(int i =0; i < N; i++){
        	System.out.print(result_list.get(i) + " ");
        }
    } catch (Exception e){
    }
}
