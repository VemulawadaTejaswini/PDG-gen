import java.util.Scanner;                                                                     
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();

        int max = a;
        int min = a;
        long sum = 0;
        for(int i = 0; i < n; i++){
            a = in.nextInt();
            if(a < min){
                min = a;
            }
            if(a > max){
                max = a;
            }
            sum += a;

        }
        System.out.println(min + " " + max + " " + sum);
    }
}