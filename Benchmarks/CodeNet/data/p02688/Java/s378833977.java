import java.util.*;

public class Main{
  static public void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    int[] sunuke = new int[N];
    for(int i=0; i<N; i++){
      sunuke[i] = 0;
    }
    
    int di, A;
    for(int j=0; j<K; j++){
      di = sc.nextInt();
      for(int k=0; k<di; k++){
        A = sc.nextInt();
        if(sunuke[A-1] == 0){
          sunuke[A-1]++;
        }
      }
    }
    
    int count = 0;
    for(int h=0; h<N; h++){
      if(sunuke[h] == 0){
        count++;
      }
    }
    
    System.out.println(count);
    
  }
}