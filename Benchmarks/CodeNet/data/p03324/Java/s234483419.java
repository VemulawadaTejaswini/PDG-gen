import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int D = input.nextInt();
            int N = input.nextInt();
           
            if(N == 100){
                ++N;
            }

            System.out.print(N);
            for(int i = 0; i < D; ++i){
                 System.out.print("00");
            }
            System.out.println();
        }
    }
}