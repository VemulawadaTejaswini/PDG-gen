import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String C = sc.next();
        char[] c  = C.toCharArray();
        
        int countR = 0;
        for(int i = 0; i < N ; i++){
          if(c[i] == 'R'){
            countR++;
          }
        }
      
        if(countR == N){
          System.out.println(0);
        }else{
              int count = 0;
                  if(c[0] =='W' && c[N-1] == 'R'){
                     count++;
                     c[0] = 'R';
                     c[N-1] = 'W';
                  }
            
              for(int j = 1; j < N; j++){
                if(c[j-1] == 'W' && c[j] == 'R'){
                  count++;
                  c[j] = 'W';
                }
              }
        
                 System.out.println(count);
         
	    }
    }
}