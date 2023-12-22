import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(true){
    		int n = input.nextInt();
    		if(n == 0)break;
    		String st = String.valueOf(n);
    		int sum = 0;
    		for(int i = 0 ; i < st.length(); i++){
    			sum += (st.charAt(i)-48);
    		}
    		System.out.println(sum);
    	}
    }
}