import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    int[] buf = new int[n];
    
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    Arrays.sort(a);

    for(int i = 0; i < n; i++){
      for(int j = i + 1; j < n; j++){
        if(a[i] == a[j]){
          buf[i] += 1;
        }
      }
      System.out.println(buf[i]);
    }

  }

  public int combination(int a){
    int ans = a * (a - 1) / 2;
    return ans;
  }
  
}
