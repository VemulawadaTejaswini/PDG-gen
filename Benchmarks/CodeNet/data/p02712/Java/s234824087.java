import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        long sum = 0;

        for(int i = 1; i<=N; i++){
            if(i%3 != 0 && i%5 != 0){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}