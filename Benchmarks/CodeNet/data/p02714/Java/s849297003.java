import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String N = scanner.next();
	char[] S = new char[n];
    S = N.toCharArray();
	
    int ans = 0;
    for (int i = 0; i < n-2;i++){
      char X;
      char Y;
      X = S[i];
      for (int j = i+1; j < n-1;j++){
        if (S[j] != X){
          Y = S[j];
          char Z = S [j+1];
          if (j == i+1 && X == Y && Y == Z){
            break;
          }
          for (int k = j+1; k < n;k++){
            if (S[k] != X && S[k] != Y){
              ans++;
            }
          }
        }
      }
    }
    System.out.println(ans);
  }  
}





