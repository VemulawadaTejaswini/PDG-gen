import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x, y;
		while(scan.hasNext()){
			x = scan.nextInt();
			y = scan.nextInt();
			if(x < y)
	         System.out.println(x + " " + y);
			else
				System.out.println(y + " " + x);
		}
        scan.close();
    }

}