import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();
      	for(int i = 0; i < 1000000; i++);
		long aw = c-b;
		long t = a-d;
		if(aw>=t && aw>0){
			System.out.println("No");
          break;
		}
		else{
			System.out.println("Yes");
          break;
		}
    }
	}
}