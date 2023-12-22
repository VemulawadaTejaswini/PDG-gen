//¬¶Æå¶ðüêÖ¦évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder(sc.nextLine());
		int len = str.length();
		for(int i=0; i<len;i++){
			if(Character.isLowerCase(str.charAt(i))){
				char upperStr = Character.toUpperCase(str.charAt(i));
				str.setCharAt(i, upperStr);
			}
			else if(Character.isUpperCase(str.charAt(i))){
				char lowerStr = Character.toLowerCase(str.charAt(i));
				str.setCharAt(i, lowerStr);
			}
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}