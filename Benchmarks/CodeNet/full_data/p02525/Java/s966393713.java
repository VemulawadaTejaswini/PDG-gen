import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(true){
    		int num = input.nextInt();
    		if(num == 0)break;
    		int[] a = new int[num];
    		double ave = 0;
    		double dis = 0;
    		for(int i = 0 ; i < a.length ; i++){
    			a[i] = input.nextInt();
    			ave += a[i];
    		}
    		ave /= num;
    		for(int i = 0 ; i < a.length ; i++){
    			dis += Math.pow((ave-a[i]),2);
    		}
    		System.out.println(new DecimalFormat("#.#########").format(Math.sqrt(dis/num)));
    	}
    }
}