import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String target = scanner.nextLine();
		int count=0;
		while(true){
			String text=scanner.next();
			if(text.equals("END_OF_TEXT")){
				break;
			}
			if(target.equals(text)){
				count++;
			}
		}
		System.out.println(count);
	}

}