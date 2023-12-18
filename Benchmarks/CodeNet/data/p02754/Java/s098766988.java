import java.util.Scanner;
import java.lang.Math;

class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();

        long count = 0;
        long blue = 0;
        
        for(long i = 0; i<Math.pow(10,100); i++){
            for(long j=0; j<a; j++){
                blue += 1;
                count += 1;
                if(count == n){
                    System.out.println(blue);
                    return;
                }
            }
            for(long j=0; j<b; j++){
                count += 1;
                if(count == n){
                    System.out.println(blue);
                    return;
                }
            }
        }
    }
}