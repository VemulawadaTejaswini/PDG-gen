import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
        int b = sc.nextInt();
		if(a*2<=b && b<=a*4 && b%2==0){System.out.println("Yes");}
		else{System.out.println("No");}
	}
}
	