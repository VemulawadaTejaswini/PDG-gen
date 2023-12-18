import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int D = input.nextInt();
            int N = input.nextInt();
           
            System.out.println(N);
            for(int i = 0; i < D; ++i){
                 System.out.println("00");
            }
        }
    }
}