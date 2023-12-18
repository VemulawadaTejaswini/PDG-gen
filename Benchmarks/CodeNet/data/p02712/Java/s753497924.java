
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        long N =stdIn.nextLong();

        long sum=0;

        for(int i = 0; i < N; i++){
            if(i%3 !=0 && i%5 !=0){
                sum += i;
            }
        }
        
        System.out.print(sum);

    }

}