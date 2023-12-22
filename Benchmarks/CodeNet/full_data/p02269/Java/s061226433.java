import java.util.HashSet;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			HashSet<String> dictionary = new HashSet<String>();
			int N = scanner.nextInt();
			scanner.nextLine();
			for(int i=0;i<N;i++){
				String line = scanner.nextLine();
				String[] temp = line.split(" ");
				String op = temp[0];
				String word = temp[1];
				switch(op){
				case "insert":
					dictionary.add(word);
					break;
				case "find":
					if(dictionary.contains(word)){
						System.out.println("yes");
					}else{						
						System.out.println("no");
					}
					break;
				}
			}
		}
	}
}