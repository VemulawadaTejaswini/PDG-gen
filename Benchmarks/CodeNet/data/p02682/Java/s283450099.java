import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();

        if(A==0){
			if(K<=B){
                System.out.println(0);
                return;
            }else{
                System.out.println(B-K);
                return;
            }
		}

		if(K<=(A+B)){
			System.out.println(A);
			return;
		}else{
			long diff = (K-(A+B));
			System.out.println(A-diff);
			return;
		}

	}
}
