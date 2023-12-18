import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String arr[] = S.split("");
 		//int N = sc.nextInt();
		if (arr[2].equals(arr[3])&&arr[4].equals(arr[5])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
      	sc.close();
    }
		
		
}
