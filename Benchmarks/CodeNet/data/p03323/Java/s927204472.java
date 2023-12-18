import java.util.*;
    public class Main{
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    int numD = scan.nextInt();
	    int numN = scan.nextInt();
	    
	    if(numD == 0 && numN <100){
		System.out.println(numN);
	    
	    }else if(numD == 1 && numN < 100){
		System.out.println(numN*100);
	    }else if(numD == 2 && numN < 100){
		System.out.println(numN*10000);
	    }
		
	}

	
    }
