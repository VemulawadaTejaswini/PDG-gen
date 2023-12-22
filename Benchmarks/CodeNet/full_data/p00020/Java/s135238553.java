import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str[]=new String[300];
		int i=0;
		while(s.hasNext()){
			str[i]=s.next();
			str[i]=str[i].toUpperCase();
			i++;
		}
		System.out.println(str);
	}
}