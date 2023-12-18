import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      // 取得
	  int N = sc.nextInt();
      String s = sc.next();
      int max = 0;
      int count = 0;
      for(int i=0;i<N-1;i++){
        for(int j=i+1;j<N;j++){
          for(int k=0;k<=i;k++){
          	if(s.charAt(k)==s.charAt(j)){
            	count++;
              	max = Math.max(max,count);
          	}
          }
        }
      }
      System.out.println(max);
    }
}