import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
        String s2 = sc.next();
        int min = s2.length();
        for(int i = 0; i <= s1.length() - s2.length(); i++){
        	String s3 = s1.substring(i, i + s2.length());
            int count = 0;
            for(int j = 0; j < s2.length(); j++){
            	if(s2.charAt(j) != s3.charAt(j)){
                	count++;
                }
            }
            min = Math.min(min, count);
        }
        System.out.println(min);
	}
}