import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();
        double max = 0;
        double x = 0;
        double y = 0;

        if( a == b && b == c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
    }
}
}