import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] num_str = str.split(" ");

		if(Float.parseFloat(num_str[0]) / Float.parseFloat(num_str[1]) <= Float.parseFloat(num_str[2])){		
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}