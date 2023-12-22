import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int n = sc.nextInt();
      if(n == 0) break;

      int m = sc.nextInt();
      char[] s = sc.next().toCharArray();
      int[] IOIlength = new int[m];
      int[] lengthCount = new int[m + 1];
      int previousLength = -1;

      for(int i = 2; i < m; i++){
        if(s[i] == 'I' && s[i - 1] == 'O' && s[i - 2] == 'I'){
          IOIlength[i] = IOIlength[i - 2] + 1;
          if(IOIlength[i] <= previousLength){
            lengthCount[previousLength]++;
          }
          previousLength = IOIlength[i];
        }
      }
      if(0 < previousLength){
        lengthCount[previousLength]++;
      }

      int answer = 0;

      for(int i = n; i <= m; i++){
        if(lengthCount[i] > 0){
          answer += (i - n + 1) * lengthCount[i];
        }
      }

      System.out.println(answer);
    }
  }
}