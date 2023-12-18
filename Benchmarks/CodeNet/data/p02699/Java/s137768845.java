import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 羊(S)
		int s = sc.nextInt();
		// 狼(W)
		int w = sc.nextInt();
		
 		if(s > w) {
			System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
	}
}