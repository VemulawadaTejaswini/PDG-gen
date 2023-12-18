import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
        int M = sc.nextInt();
      	int Count[] = new int[N];
      	int i = 0;
      	for(i = 0;i < M * 2 ;i++){
		  Count[sc.nextInt() -1] += 1;
        }
      	for(i = 0;i < N; i++){
          System.out.println(Count[i]);   
        }

    }
}