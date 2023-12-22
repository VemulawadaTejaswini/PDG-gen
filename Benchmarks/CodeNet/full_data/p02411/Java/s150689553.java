import java.util.Scanner;
class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int m;
    	int f;
    	int r;
    	int total;
    	int Absent = -1;
    	
    	for(;;){
    		m = scan.nextInt();
    		f = scan.nextInt();
    		r = scan.nextInt();
    		
    		if(m == Absent && f == Absent && r == Absent){
    			break;
    		}
    		
    		if(m == -1 || f == -1){
    			System.out.println("F");
    		}else{
	    		total = m + f;
	    		if(total >= 80){
	    			System.out.println("A");
	    		}else if(total < 80 && total >= 65){
	    			System.out.println("B");
	    		}else if(total < 65 && total >= 50 || r >= 50){
	    			System.out.println("C");
	    		}else if(total < 50 && total >= 30){
	    			System.out.println("D");
	    		}else{
	    			System.out.println("F");
	    		}
    		}
    	}
    }
}