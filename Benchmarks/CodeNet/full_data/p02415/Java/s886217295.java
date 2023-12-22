import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = a.toUpperCase();
		String c = a.toLowerCase();
		String[] s1 = a.split("");
		String[] s2 = b.split("");
		String[] s3 = c.split("");
		int i;
		for(i = 0; i < 1200; ++i){
			if(s1[i].equals(".")){
				break;
			}
			if(s1[i].equals(s2[i]))
				System.out.print(s3[i]);
			else{
				System.out.print(s2[i]);
			}
		}
	}
}