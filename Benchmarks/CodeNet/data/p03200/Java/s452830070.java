import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		int sum = 0;
		int p = 0;
		for(int i=0;i<S.length();i++){
			String x = S.substring(i, i+1);
//			System.out.println(x);
			if(x.equals("B")){
				p+= 1;
			}else{
				sum += p;
			}
		}
		System.out.println(sum);
	}

}

