import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long X = scan.nextLong();
                if(0<X || X<0){
                    for(long i=-120; i<=120; i++){
                        for(long j=-120; j<=120; j++){
                            if(i*i*i*i*i-j*j*j*j*j==X){
                                System.out.println(i + " " + j);
                                System.exit(0);
                            }
                        }
                    }
                }
                else if(X==0){
                    System.out.println("1 1");
                }
        }
}