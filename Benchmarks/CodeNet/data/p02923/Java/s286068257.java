import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] H = new int[N+1]; 
     for (int i=1;i<N+1;i++){
       H[i]= scan.nextInt();
     }
    
    int count =0;
    int best=0;
    for (int j=	1;j<N;j++){
     if(H[j]>=H[j+1]) {
       count ++;
     }else{
       if(best<count) best=count;
       count =0;
     }
    }
    if(best<count) best=count;
  
    System.out.println(best);
  
  }
 
}