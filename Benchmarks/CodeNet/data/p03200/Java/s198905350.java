import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		long sum = 0;
		long p = 0;
		for(int i=0;i<S.length();i++){
			String x = S.substring(i, i+1);
//			System.out.println(x);
			if(x.equals("W")){
				sum += p;
			}else{
				p+= 1;
			}
		}
		System.out.println(sum);
	}

}

