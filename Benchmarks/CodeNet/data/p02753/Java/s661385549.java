import java.util.Scanner;
 
class StationandBus {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
 
		String A = stdIn.next();
		
	if( A.charAt(0)==A.charAt(1) && A.charAt(1)==A.charAt(2) ){
			System.out.println("no");
        }else{
			System.out.println("yes");
    	}
 
	}
    
}