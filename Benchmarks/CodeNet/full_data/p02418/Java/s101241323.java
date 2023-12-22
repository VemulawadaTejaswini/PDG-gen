import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String new_s = s+s;
		String p = sc.next();
		
		if(new_s.contains(p)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}
