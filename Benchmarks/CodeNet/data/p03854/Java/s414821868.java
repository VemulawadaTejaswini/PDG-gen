import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.substring(s.length()-5, s.length()).compareTo("dream")==0){
			System.out.println("YES");
		}
		else if (s.substring(s.length()-7, s.length()).compareTo("dreamer")==0){
			System.out.println("YES");
		}
		else if (s.substring(s.length()-5, s.length()).compareTo("erase")==0){
			System.out.println("YES");
		}
		else if (s.substring(s.length()-6, s.length()).compareTo("eraser")==0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}
