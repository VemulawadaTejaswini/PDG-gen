import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		if(x == 0 && y == 0) {break;}
    		
    		else if(x > y){
    			System.out.println(y+" "+x);
    		}
    		
    		else{
    			System.out.println(x+" "+y);
    		}
    		
    	}
    }

}