import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String s=sc.next();
	char c[]=s.toCharArray();
	for(int i=0;i<=s.length()-1;i++){
if(i!=3){System.out.print(c[i]);}else{
	System.out.print(8);
}

	}
System.out.println();
	}}