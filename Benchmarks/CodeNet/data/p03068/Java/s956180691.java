import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String S = sc.nextLine();
		int K = Integer.parseInt(sc.nextLine());
		
		String[] spl = S.split("");
		String keyString = spl[K-1];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < spl.length; i++){
			if(!(spl[i].equals(keyString))){
				spl[i] = "*";
			}
			sb.append(spl[i]);
		}
		System.out.println(sb.toString());
	}

}