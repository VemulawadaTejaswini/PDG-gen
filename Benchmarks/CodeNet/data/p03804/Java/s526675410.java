import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	String strA[]=new String[a];
	String strB[]=new String[b];
	for(int i=0;i!=a;i++) {
		strA[i]=scan.next();
	}
	for(int i=0;i!=b;i++) {
		strB[i]=scan.next();
	}
	int fig=0;
	loop:for(int i=0;i!=a-b+1;i++) {
		if(strA[i].substring(i,i+b).equals(strB[0])) {
			for(int j=1;j!=b+1;j++) {
				if(j==b) {
					fig=1;
					break loop;
				}
				if(strA[i+j].substring(i,i+b).equals(strB[j])){	
				}
				else {
					break;
				}
			}
		}
	}
	System.out.println(fig==1?"Yes":"No");
}
}