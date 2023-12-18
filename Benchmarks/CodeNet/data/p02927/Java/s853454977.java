import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        for(int i = 2; i < m + 1; i++){
        	for(int j = 2; j < d + 1; j++){
                int a = j / 10;
          		int b = j % 10;
                if(a != 1 && b != 1 && i == a * b){
                	count++;
                }
            }
        }
        System.out.println(count);
    }
}