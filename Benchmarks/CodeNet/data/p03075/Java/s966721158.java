import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Integer before = 0;
        Integer now = 0;
        boolean flag = true;
        
        List<Integer> poleArray = new ArrayList<>();
        
        while(sc.hasNextInt()) {
        	poleArray.add((Integer)sc.nextInt());
        }
        
        for(int i = 0; i < poleArray.size() - 1; i++) {
        	before = poleArray.get(i);
        		for(int j = 0; j < poleArray.size() - 1; j++) {
        			now = poleArray.get(j);  
		        	if(Math.abs(before - now) >= poleArray.get(poleArray.size() - 1)) {
		        		flag = false;
		        		break;
		        	}
        		}
        }
        
        if(flag) {
        	System.out.println("Yay!");
        }else {
        	System.out.println(":(");
        }
    }
}