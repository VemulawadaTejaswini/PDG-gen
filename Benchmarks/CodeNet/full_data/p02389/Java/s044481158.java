import java.util.Scanner;

public Main(){
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        short a = scan.nextShort();
        short b = scan.nextShort();

        System.out.printf("%d %d",a*b, 2*a+2*b);
}
