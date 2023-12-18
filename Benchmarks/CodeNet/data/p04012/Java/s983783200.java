import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String w=sc.nextLine();
		int len=w.length();

		char c[]=new char[len];
		for(int i=0;i<len;i++){
			c[i]=w.charAt(i);
		}

		int jud=0;
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(c[i]==c[j])	jud++;
			}
		}

		jud=jud%2;
		if(jud==0)	System.out.println("Yes");
		else	System.out.println("No");
	}
}