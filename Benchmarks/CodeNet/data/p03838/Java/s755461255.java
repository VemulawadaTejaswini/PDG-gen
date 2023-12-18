import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		if(x * y >=0){
            System.out.println(Math.abs(Math.abs(x) - Math.abs(y)));
        }else{
        	System.out.println(Math.abs(Math.abs(x) - Math.abs(y)) + 1);
        }
	}
}
