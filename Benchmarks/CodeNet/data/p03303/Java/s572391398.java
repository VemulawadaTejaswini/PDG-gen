import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.nextLine();
	    int w = scanner.nextInt();
	    
	    String[] ar = S.split("");
	    String text = "";
	    int count;
	    count = S.length() / w;
	    if(S.length() - (S.length() / w) * w > 0) count  = S.length() / w + 1 ;
	    for(int i = 0; i<count; i++) {
	    		text = text + ar[w*i];
	    }
	    System.out.println(text);
		scanner.close();
	}

}
