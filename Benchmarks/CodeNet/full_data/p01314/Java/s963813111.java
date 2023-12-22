import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int N;

        while((N = scan.nextInt()) != 0){

            if(N%2 == 0){
                System.out.println(Even_Number(N));
            } else{
                System.out.println(Odd_Number(N));
            }
        }
    }

    public static int Odd_Number(int number){
        int count = 1;
        for(int i = 3; i*2-1<number; i += 2){
            if(number%i == 0){
                if(number/i > i){
                    continue;
                }
                count++;
            }
        }
        return count;
    }

    public  static int Even_Number(int number){
        int count = 0;
        for(int i = 3; i*2-1<number; i += 2){
            int j = number%i;
            int k = number/i;
            if(j == 0  && number%(k*2) == k){
                count++;
            }
        }
        return count;
    }
}