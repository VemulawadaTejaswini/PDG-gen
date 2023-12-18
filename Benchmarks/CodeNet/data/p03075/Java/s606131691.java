import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		
        int k = sc.nextInt();
        
        boolean check = false;
                
        for(int i = 0; i < 5; i++) {
        	for(int j = 0; j < 5; j++) {
        		if(Math.abs(list.get(i) - list.get(j)) <= k) {
        			check = true;
        		} else {
        			check = false;
        			break;
        		}
        	}
        }
        
        if(check) {
        	System.out.print("Yay!");
        } else {
        	System.out.print(":(");        	
        }
	}	
}