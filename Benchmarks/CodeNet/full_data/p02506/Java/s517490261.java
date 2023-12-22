//¶Í T ÌÉ é PÂÌPêW ÌðoÍ·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		int count =0;
		String compare = sc.next();
		String end = "END_OF_TEXT";
		while(! compare.equals(end)){
			if(w.equalsIgnoreCase(compare)){
				count++;
			}
			compare = sc.next();
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}