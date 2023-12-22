
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			StringBuilder str = new StringBuilder(sc.nextLine());
			for(int i=0; i < str.length() - 4; i++){
				String temp = str.substring(i, i+5);
				if("peach".equals(temp)){
					str.replace(i, i+5, "apple");
				}
			}
			System.out.println(str.toString());
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}