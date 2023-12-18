import java.util.Scanner;

public final class Main{
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);

        long N = stdIn.nextLong();

        int counter = 0;

        for(long i=1; i<N; i++){
            if(N/i == N%i){
                counter++;
            }
        }

        System.out.println(counter);
    }
}