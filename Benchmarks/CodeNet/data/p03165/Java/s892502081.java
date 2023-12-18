import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		int sLen = s.length();
		int tLen = t.length();
		StringBuffer[]oldLcs = new StringBuffer[tLen+1];
		StringBuffer[]newLcs = new StringBuffer[tLen+1];
		StringBuffer[]tmp = null;
		for (int j=0;j<=tLen;j++) {
			oldLcs[j]=new StringBuffer();
		}
		newLcs[0]= new StringBuffer();
		for (int i=1;i<=sLen;i++) {
			for (int j=1;j<=tLen;j++) {
				if(s.charAt(i-1)==t.charAt(j-1)) {
					newLcs[j]=new StringBuffer(oldLcs[j-1]);
					newLcs[j].append(s.charAt(i-1));
				} else if (oldLcs[j].length() > newLcs[j-1].length()){
					newLcs[j]=oldLcs[j];
				} else {
					newLcs[j]=newLcs[j-1];
				}
			}
			tmp = oldLcs;
			oldLcs=newLcs;
			newLcs = tmp;
			newLcs[0]=new StringBuffer();
		}
		System.out.println(oldLcs[tLen]);
	}

}