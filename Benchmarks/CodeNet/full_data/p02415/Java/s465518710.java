import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String oldstr = scan.nextLine();
		scan.close();
		String newstr = "";
		//char substr[] = str.toCharArray();
		for(int i = 0; i < oldstr.length(); i++){
			String target = oldstr.substring(i, i + 1);
			if(target.equals(target.toLowerCase())){
				target = target.toUpperCase();
			}else if(target.equals(target.toUpperCase())){
				target = target.toLowerCase();
			}
			newstr += target;
		}
		System.out.println(newstr);
	}
}