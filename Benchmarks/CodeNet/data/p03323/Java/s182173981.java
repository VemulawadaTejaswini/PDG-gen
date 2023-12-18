import java.util.*;
 class HappyBirthday{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<=8&&b<=8)
			System.out.println("Yay!");
		else System.out.println(":(");
	}
}