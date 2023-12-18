import java.util.*;
    public class Main{
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    int numD = scan.nextInt();
	    int numN = scan.nextInt();
	    if(numN==100){
		if(numD==0){
		System.out.println((numN-1));
		}else if(numD == 1){
		    System.out.println((numN*100-100));
		}else if(numD==2){
		    System.out.println((numN*10000-10000));

		}
	    }
	    if(numD == 0 && numN <100){
		System.out.println(numN);
	    
	    }else if(numD == 1 && numN < 100){
		System.out.println(numN*100);
	    }else if(numD == 2 && numN < 100){
		System.out.println(numN*10000);
	    }
		
	}

	
    }
