import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int x = in.nextInt();
		 int i =1;
		 while(i<=3){
			 x *=x;
			 i++;
		 }
		 System.out.println(x);


	}

}