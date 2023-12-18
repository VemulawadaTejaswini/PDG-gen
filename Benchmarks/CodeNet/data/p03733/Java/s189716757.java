import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
        int t = sc.nextInt();
        int number[] = new int[num];
        number[0] = 0;
        int sum = t;
        for(int i = 1; i < num; i++){
        	number[i] = sc.nextInt();
            if(number[i] - number[i - 1] < t){
            	sum += number[i] - number[i - 1];
            }else{
            	sum += t;
            }
        }
        System.out.println(sum);
	}
}