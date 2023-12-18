import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	int sum = 0;
      	for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == 'o') sum++;
        }
      	System.out.println(700 + (sum*100));
    }
}