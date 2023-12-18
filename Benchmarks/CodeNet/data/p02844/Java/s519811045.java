import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt();
      String S = sc.next();
      String[] sA = S.split("");
      int max = N*(N-1)*(N-2)/6;
      Map<String,Integer> map = new HashMap<>();
      int s1=0;
      int s2=1;
      int s3=2;
	  for(s1=0;s1<N-2;s1++){
        for(s2=s1+1;s2<N-1;s2++){
         for(s3=s2+1;s3<N;s3++){
           map.put(sA[s1]+sA[s2]+sA[s3],0);
         }
        }
      }
      System.out.println(map.size());
    }
}
