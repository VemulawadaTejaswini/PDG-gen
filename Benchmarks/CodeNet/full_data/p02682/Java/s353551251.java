
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	int K = sc.nextInt();
        int sum=0;
      	
  		for(int i=0;i<K;i++){
          if(A>0){
          	sum=sum+1;
            A=A-1;
            i++;
          }
          else if(A=0&&B>0){
          	sum=sum+0;
            B=B-1;
            i++;
          }
          else if(A=0&&B=0&&C>0){
          	sum=sum-1;
            C=C-1;
          	i++;
          }
        }
	}
}
