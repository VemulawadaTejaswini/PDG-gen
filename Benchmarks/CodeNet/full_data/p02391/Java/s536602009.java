public class Main {
public static void main(String[] args){
	
	String[] input = new java.util.Scanner ( System.in ). nextLine().split(" ");
	int a = Integer.parseInt(input[0]);
	int b = Integer.parseInt(input[1]);
	if (a < b)
		System.out.println("a" + " < " + "b");
	else if (a > b)
		System.out.println("a" + " > " + "b");
	else if (a == b)
		System.out.println("a" + " == " + "b");
	
	
}
}