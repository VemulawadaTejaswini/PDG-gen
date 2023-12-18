import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.nextLine();
	    int w = scanner.nextInt();
	    
	    String[] ar = S.split("");
	    String text = "";
	    for(int i = 0; i < S.length() / w; i++) {
	    		text = text + ar[w*i];
	    }
	    System.out.println(text);
		scanner.close();
	}

}
