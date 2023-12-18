import java.util.Scanner;


public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
        STring[] data  =s.split(" ");

      
        int N = Integer.parseInt(data[0]);
        int R = Integer.parseInt(data[1]);
		
		System.out.println(R - (100*(10-N)));
	}
}
