import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int abs = Math.abs(Math.abs(x) - Math.abs(y));
		if(x * y < 0 || (x == 0 && y < 0) || (y == 0 && x > 0)){
            System.out.println(abs + 1);
        }else if((x > 0 && y > 0 && x > y) || (x < 0 && y < 0 && x > y)){
        	System.out.println(abs + 2);
        }else{
        	System.out.println(abs);
        }
	}
}
