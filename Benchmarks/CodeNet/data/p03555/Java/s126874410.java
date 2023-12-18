import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
      	String s2 = scn.next();
      	String[] list1 = s1.split("");
      	String[] list2 = s2.split("");
      	String ans = "NO";
      	if(list1[0].equals(list2[5]) && list1[1].equals(list2[4]) && list1[2].equals(list2[3])) ans = "YES";
      	System.out.println(ans);
	}
}
