import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力(AとB)
		long A = sc.nextLong();
		long B = sc.nextLong();
      	long answer =A;
		for(long i=A;i<B;i++){
          answer = answer^(i+1);
        }
		System.out.println(answer);
	}
}
 