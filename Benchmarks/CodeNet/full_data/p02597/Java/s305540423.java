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
          if(N % 2 == 0){
              int count = 0;
              for(int i = 0; i < N/2; i++){
                  if(c[i] =='W' && c[N-1-i] == 'R'){
                     count++;
                  }else if(c[i] == 'R' && c[N-1-i] == 'R'){
                     count++;
                  }else if(c[i] == 'W' && c[N-1-i] == 'W'){
                  }
               }
        
      
                 System.out.println(count);
          }else{
            int count = 0;
            for(int i = 0; i < N/2; i++){
                if(c[i] =='W' && c[N-1-i] == 'R'){
                     count++;
                }else if(c[i] == 'R' && c[N-1-i] == 'R'){
                     count++;
                }else if(c[i] == 'W' && c[N-1-i] == 'W'){
                }
             }
            if(c[N/2+1] == 'R'){
               count++;
            }
          
          System.out.println(count);
        }
	}
    }
}