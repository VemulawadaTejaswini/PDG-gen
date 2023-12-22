import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;;i++){
			int x = sc.nextInt();
			if(x == 0){
				break;
			}
			i++;
			System.out.println("Case "+ i +": "+ x);
		}
	}
}