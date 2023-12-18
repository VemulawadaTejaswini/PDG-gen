import java.util.*;

class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int temp = 0;
    int max = 0;
    for(int i = 0; i < n; i++) {
    	if(s.charAt(i) == 'I') {
    		temp++;
    		if(temp > max) {
    			max = temp;
    		}
    	} else {
    		temp--;
    	}
    }
    System.out.println(max);
}
}
