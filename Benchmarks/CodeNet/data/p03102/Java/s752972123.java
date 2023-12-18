import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
class Main {
  public static void main(String[] args) throws Exception {
    
   // System.out.println("Hello Codiva");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int arr[][] = new int[N][M];
    int arr2[] = new int [M];
    for(int j =0 ; j<M ;j++){
        arr2[j] = Integer.parseInt(br.readLine());
      }
    ArrayList<Integer> a = new ArrayList<>();
     for(int j =0 ; j<M*N ;j++){
         a.add(Integer.parseInt(br.readLine()));
      }
    
     int count = 0 , count2 = 0 , sum = 0;
     for(int j =0 ; j<M ;j++){
        
       	sum+=arr2[j]*a.remove(0);
      	if(j == M-1){
          if(sum+C > 0){
            count2++;
          } 
          if(count == 1)
            break;
          else
            j =-1 ;
          count++ ;
        }
     }
    

    
    System.out.println(count2);
    
    
  
  }
}
