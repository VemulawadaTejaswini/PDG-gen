import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
        int min = a;
        int max = a;
        
        for(int i = 0; i < n; i ++) {
        	a = sc.nextInt();
        	if(min > a) {
        		min = a;
        	}else if(max < a) {
        		max = a;
        	}
        }
        System.out.println(max - min);
	}
}