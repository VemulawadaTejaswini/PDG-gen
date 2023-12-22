import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int s = input.nextInt();
    	int[] sa = new int[s];
    	for(int i = 0 ; i < s ; i++){
    		sa[i] = input.nextInt();
    	}
    	int t = input.nextInt();
    	int[] ta = new int[t];
    	for(int i = 0 ; i < t ; i++){
    		ta[i] = input.nextInt();
    	}
    	int count = 0;
    	for(int i = 0 ; i < t ; i++){
    		for(int j = 0 ; j < s ; j++){
    			if(ta[i] == sa[j])count++;
    		}
    	}
    	System.out.println(count);
    }
}