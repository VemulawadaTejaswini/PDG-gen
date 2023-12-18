import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
        char c[] = s.toCharArray();
        Arrays.sort(c);
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            for(int j = i; j < s.length(); j++){
            	if(c[i] == c[j]){
            		count++;
            	}
            }
            if(count % 2 != 0){
            	System.out.println("No");
                return;
            }else{
            	i += count - 1;
            }
        }
        System.out.println("Yes");
    }
}