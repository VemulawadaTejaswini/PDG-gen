import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int S[] = new int[n];
    for(int i = 0; i < n; i++){
      S[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    int T[] = new int[q];
    for(int i = 0; i < q; i++){
      T[i] = sc.nextInt();
    }

    int ans = 0;

    for(int i = 0; i < q; i++){
      int left = -1;
      int right = n -1;

      while(right - left > 1){
        int mid = (left + right)/2;
        
        if(S[mid] >= T[i]) right = mid;
        else left = mid;
      }
      
      if(S[right] == T[i]) ans++;
    }

    System.out.println(ans);

    sc.close();
  }
}
