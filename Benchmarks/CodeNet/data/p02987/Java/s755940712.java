import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char[] s = sc.next().toCharArray();
      	Arrays.sort(s);
      	if(s[0]==s[1] && s[1]!=s[2] && s[2]==s[3]) System.out.println("Yes");
      	else System.out.println("No");
		//System.out.println(s[0]+""+s[1]+""+s[2]+""+s[3]);	
    }
}