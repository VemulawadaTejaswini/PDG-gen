import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();

		List<Character> list = new ArrayList<>();
		list.add('A');
		list.add('C');
		list.add('G');
		list.add('T');

		List<Character> res1 = new ArrayList<>();
		String s1 = s;

		boolean finded = false;

		for(int i = 0; i < 10; i++){
			if(s1.isEmpty())
				break;
			char first = s1.charAt(0);
			if(list.contains(first)){
				res1.add(first);
				finded = true;
			}else{
				if(finded)
					break;
			}
			s1 = s1.substring(1);
		}

		List<Character> res2 = new ArrayList<>();
		String s2 = s;

		finded = false;
		for(int i = 0; i < 10; i++){
			if(s2.isEmpty())
				break;
			char first = s2.charAt(s2.length() - 1);
			if(list.contains(first)){
				res2.add(first);
				finded = true;
			}else{
				if(finded)
					break;
			}
			s2 = s2.substring(1);
		}

		System.out.println(Math.max(res1.size(), res2.size()));
	}
}
