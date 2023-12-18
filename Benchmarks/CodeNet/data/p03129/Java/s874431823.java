import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int K = sc.nextInt();
		if(N%2 == 1){
          if(N/2+1 < K){
          	System.out.println("NO");
          }else{
          	System.out.println("YES");
          }
        }else{
        	if(N/2 < K){
            	System.out.println("NO");
            }else{
           	 System.out.println("YES");
            }
        }
    }
}
