import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		for(;;){
			String input = scan.next();
			if(input.equals("-")){
				break;
			}
			List<Character> listC = new ArrayList<Character>();
			for(int i = 0; i < input.length(); i++){
				char c = input.charAt(i);
				listC.add(c);
			}
			int m = scan.nextInt();
			for(int i = 0; i < m; i++){
				int h = scan.nextInt();
				for(int j = 0; j < h; j++){
					char c = listC.get(j);
					listC.remove(j);
					listC.add(c);
				}
			}
			for(int i = 0; i < input.length(); i++){
				System.out.print(listC.get(i));
			}
			System.out.println("");
		}
	}
}