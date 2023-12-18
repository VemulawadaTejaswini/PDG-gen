import java.util.*;

public class Main{

	public static void main (String[] args){

	//variable

		int a;
		String s;
		Scanner sc= new Scanner(System.in);

	//number

		System.out.println("Enter a");
		a= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter color");
		s= sc.nextLine();

	//if statement

		if(a<3200)
			System.out.println(s);
		else
			System.out.println("red");