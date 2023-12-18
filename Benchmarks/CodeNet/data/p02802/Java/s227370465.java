import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int p;
    String S;
    int AC[] = new int[N];
    int WA[] = new int[N];
        
    for(int i=0; i<N; i++){
      AC[i]=0;
      WA[i]=0;
    }
    
    int penalty = 0;
    for(int i=0; i<M; i++){
      p=sc.nextInt()-1;
      S=sc.next();
      
      if(S.equals("WA")){
        WA[p]++;
      }else if(S.equals("AC")){
        if(AC[p]==0){
          penalty = penalty + WA[p];
        }
        AC[p]=1;
      }
    }
    int clear = 0;
    for(int i=0; i<N; i++){
      clear = clear + AC[i];
    }
    System.out.print(clear + " " + penalty);
  }
}
 