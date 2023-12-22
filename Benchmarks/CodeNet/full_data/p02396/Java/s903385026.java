
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int i = 0;
		while(true){
			i++;
		if(x==0){
			break;
		}else{
			if(x>=1 && x<=1000)
			System.out.print("Case "+i+": "+x);
			x = s.nextInt();
			continue;
		}
		}
		}

}