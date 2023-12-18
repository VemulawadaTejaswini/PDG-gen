import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int count = 0;
        scan.close();

        if(n > 1){
            count += n * (n-1) / 2;
        }
        if(m > 1){
            count += m * (m-1) / 2;
        }

        System.out.println(count);
    }
}