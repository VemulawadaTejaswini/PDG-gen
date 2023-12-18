import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int slength=s.length();
		String t=sc.next();
		int tlength=t.length();
		int index=0;
		long count=1;
		for(int i=0;i< tlength;i++) {
			char tmp=t.charAt(i);
			char[] S=s.toCharArray();
			for(int j=0;j<slength;j++) {
				if(index!=slength-1) {
					index++;
				}else {
					index=0;
				}
				count++;
				if(tmp==S[index]) {
					break;
				}
				if(j==slength-1) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(count);
	}

}
