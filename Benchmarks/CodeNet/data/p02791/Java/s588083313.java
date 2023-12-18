import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] box = new int[n];
    for (int i=0; i<n; i++) {
      box[i] = sc.nextInt();
    }
    
    int ans = 1;
    for (int i=0; i<n-1; i++) {
      if (box[i]>=box[i+1]) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}