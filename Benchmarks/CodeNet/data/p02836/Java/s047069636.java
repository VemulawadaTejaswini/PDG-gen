import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String[] list = s.split("");
      	int count = 0;
		for(int i=0; i<s.length(); i++){
			if(!(list[i].equals(list[s.length()-1-i]))) count++;
		}
      	System.out.println(count/2);
	}
}
