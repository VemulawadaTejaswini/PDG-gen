import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      //日数
      int n = sc.nextInt();
      //基準泊数
      int k = sc.nextInt();
      //k泊目までの料金
      int x = sc.nextInt();
      //k+1泊目以降の料金
      int y = sc.nextInt();
      
      int total = 0;
      
      for(int i = 1;i <= n;i++){
        if(i <= k){
          total += x;
        }else{
          total += y;
        }
      }
      
      System.out.println(total);
	}
}
