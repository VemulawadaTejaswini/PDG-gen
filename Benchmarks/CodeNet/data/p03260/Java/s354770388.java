package test0912;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int c = 0; c < 3; c++){
			if((a*b*c) % 2 == 1){
				System.out.println("Yes");
				break;
			}
		}
		System.out.println("");
	}

}
