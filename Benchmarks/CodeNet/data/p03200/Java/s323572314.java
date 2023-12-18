import java.util.Scanner;
//AGC029A

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int len = S.length();
		int count = 0;

		String R[] = new String[len];

		for(int i = 0; i< S.length();i++) {
			R[i] = S.substring(i, i+1);
		}
		boolean flag = true;

		while(flag){
			flag = false;
			for(int i = 0; i< len-1;i++) {
				if(R[i].equals("B")&&R[i+1].equals("W")) {
					String w = R[i];
					R[i] = R[i+1];
					R[i+1]= w;

					flag=true;
					count++;
				}
			}

		}

		System.out.println(count);

	}

}