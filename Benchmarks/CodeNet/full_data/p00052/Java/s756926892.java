import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(true){
    		int num = input.nextInt();
    		if(num == 0)break;
    		System.out.println(fact(num));
    	}
    }
    
    public static int fact(int num){
    	int two_count = 0;
    	int five_count = 0;
    	for(int i = 1 ; i <= num ; i++){
    		int ban = i;
    		while(true){
    			if(ban % 2 == 0){
    				two_count++;
    				ban /= 2;
    			}else if(ban % 5 == 0){
    				five_count++;
    				ban /= 5;
    			}else{
    				break;
    			}
    		}
    	}
    	return Math.min(two_count, five_count);
    }
}