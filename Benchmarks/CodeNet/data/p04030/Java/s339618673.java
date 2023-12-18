import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		ArrayList<Character> text = new ArrayList<Character>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'B'){
				if(!(text.isEmpty())){
					text.remove(text.size()-1);
				}
			}else{
				text.add(s.charAt(i));
			}
		}
		for(int i=text.size()-1;i>=0;i--){
			System.out.print(text.get(i));
		}
		System.out.println();
	}

}
