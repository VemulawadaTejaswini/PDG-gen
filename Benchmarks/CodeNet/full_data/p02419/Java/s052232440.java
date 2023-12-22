import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		String key=sc.nextLine().toLowerCase();
		int count = 0;
		while(true){
			String[] str=sc.nextLine().split(" ");
			if(str[0].equals("END_OF_TEXT")) break;
			for(String s:str){
				s=s.toLowerCase();
				if(s.equals(key)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}