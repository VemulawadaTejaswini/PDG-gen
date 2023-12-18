import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		
		int num = x/(y+z);
		
		if(x-num*(y+z) >= z) System.out.println(num);
		else System.out.println(num-1);
	}

}
