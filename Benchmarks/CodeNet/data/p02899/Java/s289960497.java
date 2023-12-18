import java.util.*;

public class Main{
	public static void main(String args[]){
		
        Scanner sc = new Scanner(System.in);
        
      // 整数の取得
        int N = sc.nextInt();
		int childNum[] = new int[N];
		int tokojun[] = new int [N];
      
      for(int i = 0; i < N; i++){
      	childNum[i] = sc.nextInt();
        tokojun[childNum[i] - 1] = i + 1;
      }

      for(int i = 0; i < N; i++){
            System.out.print(tokojun[i]);
      }
	}
}