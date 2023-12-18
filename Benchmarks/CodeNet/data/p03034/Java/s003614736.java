import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long array[] = new long[N];
    boolean visit[] = new boolean[N];
               
    for (int i=0;i<N;i++){
      array[i] = sc.nextLong();
    }
    long ans = 0;
    for (int p=1;p<N;p++){
      //goalにつく場合
      if((N-1)%p == 0){
        long tmp = 0;
        long c = 0;
        int i = 0;
        int j = N-1;
        for (int k=0;k<N;k++){
      visit[k] = false;
    } 
        while(i<j){
          if(visit[j]){
          tmp = -10;
          break;
        }
          
          if (visit[i]){
          tmp = -10;
          break;
        }
          
          c += array[i]+array[j];
          tmp = Math.max(tmp,c);
          
          visit[i] = true;
          visit[j] = true;
          i += p;
          j -= p;
        }
       ans =  Math.max(tmp,ans);
      }
    }
        
        
    
    
    
    System.out.println(ans);
  }
}