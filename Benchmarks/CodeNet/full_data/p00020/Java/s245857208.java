import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		while(sc.hasNext()){
		str= sc.next();
		str= str.toUpperCase();
		System.out.print(str+" ");
		}		
		System.out.println("");
		}

}