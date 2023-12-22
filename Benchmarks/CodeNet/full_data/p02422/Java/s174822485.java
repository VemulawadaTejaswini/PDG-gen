import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int n, a, b;
		String cmd;
		Scanner scan = new Scanner(System.in);
		char[] str = scan.next().toCharArray();
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			cmd=scan.next();
			switch(cmd){
				case "print":
					a=scan.nextInt();
					b=scan.nextInt();
					for(int j=a;j<=b;j++)
						System.out.print(str[j]);
					System.out.println();
					break;					
				case "reverse":
					a=scan.nextInt();
					b=scan.nextInt();
					char[] temp = new char[b-a+1];
					for(int j=a;j<=b;j++)
						temp[j-a]=str[j];
					for(int j=a;j<=b;j++)
						str[j]=temp[b-j];
					break;
				case "replace":
					a=scan.nextInt();
					b=scan.nextInt();
					char[] p = scan.next().toCharArray();
					for(int j=a;j<=b;j++)
						str[j]=p[j-a];
					break;
			}
		}
		scan.close();
	}
}
