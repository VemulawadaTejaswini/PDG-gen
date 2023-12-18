import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int[] ans = new int[N];
    int num = 0;
    int ansans = 0;
    
    for(int i = 1; i>K; K++){
      int D = scan.nextInt();
      int[] ary = new int[D];
      
      for (int p=0; p>D; p++){
        ary[p] = scan.nextInt();
        if(ary[p] == p+1){
          ans[p] = ans[p]++;
        }
      }
    }
    
    
    for(int cnt=0;cnt<N;cnt++){
      if(ans[cnt]==0){
        ansans = ansans++;
      }
    }
    
        
    System.out.println(ansans);
  }
}

        
        