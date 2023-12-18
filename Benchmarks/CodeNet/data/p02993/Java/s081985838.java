import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String s_original = sc.nextLine();
		    String[] s = s_original.split("",0);
		    int flg=0;

		    for(int i=0; i<s.length-1;i++) {
		    	if(s[i].equals(s[i+1])) {
		    		System.out.println("Bad");
		    		flg=1;
		    		break;
		    	}
		    }
		    if(flg==0) {
		    	System.out.println("Good");
		    }

		    sc.close();
	}
}
