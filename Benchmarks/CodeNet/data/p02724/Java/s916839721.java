import java.util.*;

public class Main{
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int C = sc.nextInt();
	
	int a = C%500;
	int b = (a-(a%5));
	int c = (C-a)*2;
	
	System.out.println(b+c);
}
}