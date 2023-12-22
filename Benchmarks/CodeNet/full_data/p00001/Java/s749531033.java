import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
    	 Scanner sc = new Scanner(System.in);
    	 int i=0;
    	 ArrayList<Integer> list = new ArrayList<Integer>();
    	 
         while(sc.hasNextInt()) {
        	 int num = sc.nextInt();
        	 list.add(num);
        	 i++;
        	 // 入力データは10個らしいので。
        	 if(i>9){
        		 break;
        	 }
         }
    	if (sc.ioException() != null) {
    	    throw sc.ioException();
    	}
    	
    	Collections.sort(list);
    	System.out.print(list.get(9));
        System.out.print(" ");
        System.out.print(list.get(8));
        System.out.print(" ");
        System.out.print(list.get(7));
        System.out.print("\n");
    }
}