import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String S = sc.next();

    String s2 = "_";
    StringBuilder buf = new StringBuilder();
    buf.append(S);
    buf.append(s2);
    S = buf.toString();

    int[] f0 = new int[N];
    int[] f1 = new int[N];
    int count = 0;
    int k0 = 1;
    int k1 = 0;
    f0[0] = count;

    if(!S.contains("01")){
      System.out.println(S.length()-1);
    } else {
      loop:while(true){
        while(true){
          if(S.charAt(count) == "0".charAt(0) && S.charAt(count+1) == "1".charAt(0)){
            f0[k0] = count+1;
            k0++;
            break;
          }
          if(S.charAt(count) == "0".charAt(0) && S.charAt(count+1) == "_".charAt(0)){
            f0[k0] = count+1;
            k0++;
            break loop;
          }
          count++;
        }
        while(true){
          if(S.charAt(count) == "1".charAt(0) && S.charAt(count+1) == "0".charAt(0)){
            f1[k1] = count+1;
            k1++;
            break;
          }
          if(S.charAt(count) == "1".charAt(0) && S.charAt(count+1) == "_".charAt(0)){
            f1[k1] = count+1;
            k1++;
            break loop;
          }
          count++;
        }
      }
      int max = 0;

      for(int i = 0; i <= k0-K-1; i++){
        System.out.println(f1[K-1+i]);
        System.out.println(f0[i]);
        if(max < f1[K-1+i] - f0[i]){
          max = f1[K-1+i] - f0[i];
        }
      }
      System.out.println(max);
    }
  }
}
