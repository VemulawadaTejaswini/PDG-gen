import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++){
            array.add(scan.nextInt());
        }
        
        Collections.reverse(array);
        
        String result = ""; 
        
       for(int i :array){
            result += Integer.toString(i) + " ";
        }
              
        System.out.println(result);
        
        
        scan.close();
	}
}