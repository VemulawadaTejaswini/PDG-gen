import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      //整数の取得
	  int x = sc.nextInt();
      int y = sc.nextInt();
      //グループ分け
      int[] G = {1,3,1,2,1,2,1,1,2,1,2,1};
      //同じグループ??
      if(G[x]==G[y]){
         System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}