import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,o=0,ab=0;
		while(sc.hasNext()){			
			String[] str = sc.next().split(",");
			if(str[1].equals("A"))
				a++; 
			if(str[1].equals("B"))
				b++; 
			if(str[1].equals("O"))
				o++; 
			if(str[1].equals("AB"))
				ab++; 
		}
		System.out.println(a+"\r\n"+b+"\r\n"+o+"\r\n"+ab);
	}
}