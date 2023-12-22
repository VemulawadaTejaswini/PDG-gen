import java.util.*;

public class Main {

	public static void main(String[] args) throws java.io.IOException{
		int x ;
		Scanner in = new Scanner(System.in);
		for(int i = 1; i > 0; i++){
			x = in.nextInt();
			if(x == 0){
				break;
			}else{
				System.out.println("Case" + i + ":" + x);
			}
		}
	}
}