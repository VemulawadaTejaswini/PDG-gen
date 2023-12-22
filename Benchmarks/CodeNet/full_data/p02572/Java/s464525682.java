import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int n = Integer.parseInt(line);
    line = sc.nextLine();
    
    String subAi[] = new String[n];
    subAi = line.split(" ", 0);
    
    //A1からAnまでの値を格納する配列 Ai
    long Ai[] = new long[n];
    for(int i = 0; i < n; i++){
      Ai[i] = Integer.parseInt(subAi[i]) % 1000000007;
    }
    
    long AiAj = 0;
    long S = 0;
    for(int i = 0; i < n - 1; i++){
		for(int j = i + 1; j < n; j++){
          AiAj = Ai[i] * Ai[j];
          S += AiAj;
          S %= 1000000007;
        }
    }
    System.out.println(S);
    
  }
}