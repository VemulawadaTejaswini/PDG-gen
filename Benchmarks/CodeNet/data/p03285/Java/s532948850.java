import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	scan.close();
      	boolean result = false;
      	for(int i = 0; i < N / 4; i++){
        	if((N - 4 * i) % 7 == 0){
            	System.out.print("YES");
              	result = true;
              	break;
            }
        }
      	if(!result){
        	System.out.print("NO");
        }
    }
}