import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().replace(',', ' ').replace('.', ' ').split(" ");
		boolean flag = false;
		for(int i=0;i<s.length;i++){
			if(3<=s[i].length() && s[i].length()<=6){
				if(flag==true) System.out.print(" ");
				System.out.print(s[i]);
				flag = true;
			}
		}
		System.out.println();
	}
}