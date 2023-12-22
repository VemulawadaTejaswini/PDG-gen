import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		sc.nextLine();
		String str;
		while(n--!=0){
			str=sc.nextLine();
			str=str.replace("Hoshino","Hoshina");
			System.out.println(str);
		}
	}
}