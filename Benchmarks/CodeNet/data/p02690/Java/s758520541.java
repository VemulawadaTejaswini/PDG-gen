import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long X = scan.nextLong();
                long A = 0;
                long B = 0;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
               
                if(0<X || X<0){
                    for(int i=-1000; i<=1000; i++){
                        for(int j=-1000; j<=1000; j++){
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