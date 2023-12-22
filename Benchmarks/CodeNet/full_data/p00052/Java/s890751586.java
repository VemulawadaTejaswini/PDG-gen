import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){ 
    	int n = 0;
    	int result = 0;
    	n = scan.nextInt();
    	if(n==0){
    		return;
    	}else{
    	for(int i = 5; i < n;i*=5){
    		result += n/i; 
    	}
    	System.out.println(result);
    	}
    	

    }
 }
}