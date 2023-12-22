import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int N = in.nextInt();		//町の数
        BigDecimal K = new BigDecimal(in.next());	//テレポート回数
		int A[] = new int[N];		//町
		for(int i=0; i<N; i++){
			A[i] = in.nextInt();
		}
		int arrival = A[0];	//到着場所
		BigDecimal i = new BigDecimal("1");
      
		while(K.compareTo(i) == 1){
          arrival = A[arrival-1];
          i = i.add(BigDecimal.ONE);
        }
		System.out.println(arrival);
    }
}