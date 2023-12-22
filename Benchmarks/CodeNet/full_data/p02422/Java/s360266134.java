import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String command;
		int query = sc.nextInt();
		int a,b;
		for(int i = 0; i < query; i++){
			command = sc.next();
			a = sc.nextInt();
			b = sc.nextInt();
			if(command.compareTo("print") == 0){
				System.out.println(str.substring(a,b+1));
			}else if(command.compareTo("reverse") == 0){
				StringBuffer sb = new StringBuffer(str.substring(a,b+1));
				str = str.substring(0,a) + sb.reverse().toString() + str.substring(b+ 1,str.length());
			}else if(command.compareTo("replace") == 0){
				String work = sc.next();
				str = str.substring(0,a) + work + str.substring(b + 1,str.length());
			}
		}
	}
}