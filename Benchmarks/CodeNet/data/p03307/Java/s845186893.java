import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i < 999999999; i++){
		    if(i % 2 == 0 && i % n == 0){
		        System.out.print(i);
		        break;
		    }
		}
	}
}