import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N =sc.nextInt();//生徒数
      int kids[] = new int[N+1];
      
      //出席番号でまわす
      for(int i=1; i<=N; i++){
      	int s = sc.nextInt();
        kids[s] =  i;
      }
      //Arrays.sort(kids);
      
      for(int i=1; i<=N; i++){
        System.out.print(kids[i]+" ");
      //System.out.println(index_i);
      }
    }
}