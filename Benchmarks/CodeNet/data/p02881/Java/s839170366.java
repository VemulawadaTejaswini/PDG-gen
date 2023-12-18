import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long x = 0;
        long y = 0;
        out : for(long i = a / 2; i > 0; i--){
            for(long j = i; j < a+1 ; j++){
                if(i * j == a){
                    x = i;
                    y = j;
                    break out;
                }
            }
        }
        System.out.println(x+y-2);
    }
}