import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int current=0;
		int max=0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c=='A' || c=='T' || c=='G' || c=='C') {
				current++;
				if(current>max){
					max=current;
				}
			}else {
				if(current>max) {
					max = current;
				}
				current =0;
			}
		}
		System.out.println(max);
	}
}