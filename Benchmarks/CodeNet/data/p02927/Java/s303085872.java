import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        for(int i = 4; i < m + 1; i++){
        	for(int j = 22; j < d + 1; j++){
            	int x = (j / 10) * (j % 10);
                if(x == i){
                	count++;
                }
            }
        }
        System.out.println(count);
    }
}