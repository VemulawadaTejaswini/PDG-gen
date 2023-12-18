import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong(), c = sc.nextLong();
		
		if(s<=c/2){
			System.out.println(s + (c-2*s)/4);
		}
		else{
			System.out.println(c/2);
		}
	}

}
