import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] S = new int[N];
    int[] T = new int[N];
    
    for (int i = 0; i < N; i++){
      int tempX = sc.nextInt();
      int tempL = sc.nextInt();
      S[i] = tempX - tempL;
      T[i] = tempX + tempL;
    }
    
    bubbleSort(S,T);
    
    int ans = 1;
    int max = T[0];
    for(int i = 1; i < N; i++){      
      if (S[i] >= max){
        ans++;
        max = T[i];
      }
    }
    System.out.println(ans);
  }
                        
    public static void bubbleSort(int[] S,int[] T){    
      for (int i = S.length-1; i > 0 ; i--){
          for (int j = 0; j < i; j++){
            if (T[j] > T[j+1]){
              int tem = T[j];
              T[j] = T[j+1];
              T[j+1] = tem;
              tem = S[j];
              S[j] = S[j+1];
              S[j+1] = tem;                            
            }            
          }
     	 }
      }

    
}
