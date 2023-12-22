import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long L[]; L = new long[n];
    for (int i = 0; i < n; i++){
      long l = scan.nextLong();
      L[i] = l;
    }
    int ans = 0;
    for (int i = 0; i < n; i++){
      for (int j = i+1; j < n; j++){
        for (int k = j+1; k < n; k++){
          if (L[i] == L[j] || L[i] == L[k] || L[j] == L[k]){
            continue;
          }else{
            if (L[i]+L[j] > L[k] && L[i]+L[k] > L[j] && L[j]+L[k] > L[i]){
              ans++;
            }
          }
        }
      }
    }
    System.out.println(ans);
  }
}