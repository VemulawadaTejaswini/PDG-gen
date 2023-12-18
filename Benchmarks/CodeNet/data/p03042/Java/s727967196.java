import java.util.Scanner;

public class Main {
	String [] words = new String[100];
	int f,b;
	private Scanner kb;
	public void process() {
		kb = new Scanner(System.in);
		String S = kb.next();
		
		for(int i=0; i<4; i++) {
			words[i] = S.substring(i,i+1);
		}
		f = Integer.parseInt(words[0])*10 + Integer.parseInt(words[1]);
		b = Integer.parseInt(words[2])*10 + Integer.parseInt(words[3]);
		if(f>0 && f<=12 && b>0 && b<=12)
			System.out.println("AMBIGUOUS");
		else if(f>0 && f<=12)
			System.out.println("MMYY");
		else if(b>0 && b<=12)
			System.out.println("YYMM");
		else
			System.out.println("NA");
	}

	public static void main(String [] args) {
		Main app = new Main();
		app.process();
	}
}
