import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    String[] data = br.readLine().split(" ");
    for(int i = 0; i < n; i++){
      a[i] = Integer.parseInt(data[i]);
    }
    br.close();
    Arrays.sort(a);
    int num = 2;
    boolean isPairwise = true;
    boolean isSetwise = true;
    int max = (int)Math.sqrt(a[0]) + 1;
    while(num <= max){
      boolean isAll = true;
      boolean isPairwise1 = true;
      for(int i = 0; i < n; i++){
        if(a[i] % num == 0){
          if(isPairwise1 == true){
            isPairwise1 = false;
          } else {
            isPairwise = false;
          }
        } else {
          isAll = false;
        }
      }
      if(isAll == true){
        isSetwise = false;
      }
      if(num == 2){
        num++;
      } else {
        num += 2;
      }
    }
    if(isPairwise){
      System.out.println("pairwise coprime");
    } else if(isSetwise){
      System.out.println("setwise coprime");
    } else {
      System.out.println("not coprime");
    }
  }
}
