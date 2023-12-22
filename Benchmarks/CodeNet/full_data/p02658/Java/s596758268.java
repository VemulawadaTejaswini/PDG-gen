import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long Num = sc.nextLong();

		long resultMul = 1;
		long resultMax = (long) Math.pow(10, 18);
		long tmp;

		for (long i=0;i<Num;i++) {
			tmp = sc.nextLong();
			if(tmp == 0) {
				resultMul = 0;
				break;
			}
			if(resultMul > 0) {
				if(resultMul * tmp > (resultMax)) {
					resultMul = -1;
				}else {
					resultMul = resultMul * tmp;
				}
			}

		}

		System.out.println(resultMul);
		sc.close();

	}

}