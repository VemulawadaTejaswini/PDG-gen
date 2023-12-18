import java.util.*;

class Main{
	static Scanner scan = new Scanner(System.in);
	static void programmingEducation(){
		int age = scan.nextInt();
		if(age == 1){
			System.out.println("Hello World");
		}
		else{
			int a = scan.nextInt(), b = scan.nextInt();
			System.out.println(a+b);
		}
		
	}
	public static void main(String[] argv){
		programmingEducation();
	}
}