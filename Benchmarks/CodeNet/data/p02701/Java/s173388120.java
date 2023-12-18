import java.util.*;
 
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
    String[] S  = new String[N];
    for (int i = 0; i < N; i++){
      S[i] = sc.next().strip();
    }
    int ans = N;
    String temp;
    for(int i = 0; i < N-1;i++){
      temp = S[i];
      for(int j = i+1;j<N;j++){
        if (S[j].equals(temp)){
          ans--;
          break;
        }
      }
    }
    System.out.println(ans);
    
    
  }
}