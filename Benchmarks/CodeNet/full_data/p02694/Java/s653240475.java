import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        long a = 100;
        double num = scan.nextDouble();
        int aa = 0;
        while(a < num){
            a = a + a/100;
            aa++;      
        }
        System.out.println(aa);
    }
}
