import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder s= new StringBuilder(sc.nextLine());
		int counter = 0;
		int length = s.length();
		String st;

		for(int i = 0;i<length;i++) {
			if(s.indexOf("01") != -1){
				int i1 = s.indexOf("01");
				int i11 = i1 + 2;
				s.delete(i1,i11);
				counter += 2;
			}else if(s.indexOf("10") != -1){
				int i2 = s.indexOf("10");
				int i22 = i2 + 2;
				s.delete(i2,i22);
				counter += 2;
			}else{
				break;
			}
		}

		System.out.println(counter);

	}
}