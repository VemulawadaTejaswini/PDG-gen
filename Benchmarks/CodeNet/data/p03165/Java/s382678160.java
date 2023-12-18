import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		int sLen = s.length();
		int tLen = t.length();
		String[]oldLcs = new String[tLen+1];
		String[]newLcs = new String[tLen+1];
		String[]tmp = null;
		for (int j=0;j<=tLen;j++) {
			oldLcs[j]="";
		}
		newLcs[0]="";
		for (int i=1;i<=sLen;i++) {
			for (int j=1;j<=tLen;j++) {
				if(s.charAt(i-1)==t.charAt(j-1)) {
					newLcs[j]=oldLcs[j-1]+s.charAt(i-1);
				} else if (oldLcs[j].length() > newLcs[j-1].length()){
					newLcs[j]=oldLcs[j];
				} else {
					newLcs[j]=newLcs[j-1];
				}
			}
			tmp = oldLcs;
			oldLcs=newLcs;
			newLcs = tmp;
			newLcs[0]="";
		}
		System.out.println(oldLcs[tLen]);
	}

}