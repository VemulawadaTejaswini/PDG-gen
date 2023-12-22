import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int K = scan.nextInt();
                int A = scan.nextInt();
                int B = scan.nextInt();
                
                for(int i=A; i<=B; i++){
                    if(i%K==0){
                         System.out.println("OK");
                         System.exit(0);
                    }
                    else{
                        continue;
                    }
                }
                System.out.println("NG"); 
	}
}