import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){ 
    	int n = 0;
    	n = scan.nextInt();
    	if(n > 20 || n < 0){
    		break;
    	}
    	int bigkekka = 0;
    	int bigsen = 0;
    	
    	for(int i = 0; i < n; i++){
    		int num = scan.nextInt();
    		int result = scan.nextInt();
    		if(result > 101 || result < 0){
    			break;
    		}
    		if(result > bigkekka){
    			bigkekka = result;
    			bigsen = num;
    		}
    	}
    	System.out.println(bigsen + " " + bigkekka);
    	}
 }
}