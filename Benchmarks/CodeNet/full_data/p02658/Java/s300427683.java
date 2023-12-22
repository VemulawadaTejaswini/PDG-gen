import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        long sum = 1;
        long n = 1;
        for(int ii = 0; ii < 18; ii++){
            n = n * 10;
        }
        for(int i = 0; i < a; i++){
            long b = scan.nextLong();
            sum = sum * b; 
        }
        if(sum > n){
            System.out.println(-1);
        }else{
            System.out.println(sum);
        }
    
    }
}