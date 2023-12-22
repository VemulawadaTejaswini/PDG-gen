//QÂÌ® a, b ðÇÝñÅAa Æ b Ìå¬ÖWðoÍ·évOðì¬µÄº³¢B
import java.util.*;
public class Main {

	public void doIt(){
		//ÇÝÝ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > b){
			System.out.println("a > b");
		}
		else if(a < b){
			System.out.println("a < b");
		}
		else{
			System.out.println("a == b");
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}