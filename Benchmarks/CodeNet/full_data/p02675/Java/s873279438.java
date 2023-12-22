import java.util.scanner;
class Atcorder{
	public static void main(Strig[]args){
    Scanner sc = new Scannr(System.in);
    	int N = 16;
        int mod = N %10;
        
        switch(mod){
        case 2:
        case 4:
        case 5:
        case 7:
        case 9:
        	System.out.println(N + "hon")
			break;
            
       case 0:
       case 1:
       case 6:
       case 8:
       		System.out.println(N + "pon")
            break;
            
       case 3:
       		System.out.println(N + "bon")        
        
        
        
        }
    
    
    }
    

}