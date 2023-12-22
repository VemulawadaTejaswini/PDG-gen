import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int count = 1;
    	while(true){
    		int a = input.nextInt();
    		if(a == 0)break;
    		System.out.println("Case "+count+": "+a);
    		count++;
    	}
    }
}