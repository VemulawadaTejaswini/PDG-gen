import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String n = scn.next();
		boolean feka = false;
		int nigger1=-1;
		int nigger2=-1;
		for(int i = 0;i<n.length()-2;i++) {
			if(n.charAt(i)==n.charAt(i+2)) {
				feka = true;
				nigger1=i+1;
				nigger2=i+3;
				break;
			}
			if(n.charAt(i)==n.charAt(i+1)) {
				feka = true;
				nigger1=i+1;
				nigger2=i+2;
				break;
			}
		}
		if(feka) {
			System.out.println(nigger1+" "+nigger2);
		}else System.out.println(nigger1+" "+nigger2);
		scn.close();
	}
}