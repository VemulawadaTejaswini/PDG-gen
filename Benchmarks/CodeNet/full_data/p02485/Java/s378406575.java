import java.util.Scanner;

class Main {
	public static void main(String args[]){
		String str = (new Scanner(System.in).next());
		int sum = 0;
		for(int i=0;i<str.length();i++){
			sum += Integer.valueOf(str.charAt(i)+"");
		}
		System.out.println(sum);
	}
}