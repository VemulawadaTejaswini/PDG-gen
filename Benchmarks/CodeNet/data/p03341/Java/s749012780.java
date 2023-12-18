import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int min = n;
        for(int i = 0; i < n; i++){
            int count = 0;
        	for(int j = 0; j < n; j++){
            	if(i != j){
                	if(i < j && s.charAt(j) != 'W'){
                    	count++;
                    }else if(i > j && s.charAt(j) != 'E'){
                    	count++;
                    }
                }
            }
            min = Math.min(min, count);
        }
        System.out.println(min);
	}
}