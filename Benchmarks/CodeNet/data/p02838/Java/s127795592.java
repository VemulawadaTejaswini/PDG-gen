import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    long[] nums = new long[N];
    long p = 1000000007;
    long ans = 0;
    int s = 0;
    for(int i = 0; i < N; i++){
      nums[i] = Long.parseLong(S[i]);
      String T = Long.toBinaryString(nums[i]);
      s = T.length() > s ? T.length() : s;
    }
    
    long po = 1;
    for(int j = 0; j < s; j++){
      long z = 0, o = 0;
      for(int i = 0; i < N; i++){
        if(nums[i]%2 == 0){
          z++;
        }else{
          o++;
        }
        nums[i] /= 2;
      }
      ans += z*o*po;
      ans %= p;
      po *= 2;
      po %= p;
    }
    System.out.println(ans);
  } 
}
