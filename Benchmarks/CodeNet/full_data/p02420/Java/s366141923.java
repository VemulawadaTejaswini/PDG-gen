import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static PrintWriter pr=new PrintWriter(System.out);
	public static void main(String[] args) {
		while(true){    
			String temp= sc.nextLine();
			if(temp.equals("-"))break;
			int m=Integer.parseInt(sc.nextLine());
			for(int i=0;i<m;i++){
				String str=sc.nextLine();
				int h=Integer.parseInt(str);
				temp=temp.substring(h,temp.length())+temp.substring(0,h);
			}
			pr.println(temp);
		}
		pr.flush();
	}
}