import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            int right = 0;
        	for(int j = i; j < n - 1 - i; j++){
            	if(num[j] >= num[j + 1]){
                	right++;
                }else{
                	right = 0;
                }
                if(count < right){
                	count = right;
                }
            }
        }
        System.out.println(count);
    }
}