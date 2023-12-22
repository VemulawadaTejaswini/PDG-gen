import java.util.Scanner;
 
class Main {
 	private static final Scanner scan = new Scanner(System.in)
							.useDelimiter("[ \t\n,]");

    public static void main(String[] args){

    double x = 0;
    double y = 0;
    int ang = 90;
    for(;;){
        int d = scan.nextInt();
        int a = scan.nextInt();
        if(d == 0 && a == 0)  break;
        x += d * Math.cos(Math.toRadians((double) ang);
        y += d * Math.sin(Math.toRadians((double) ang);
        ang -= a;
    }
    System.out.println((int)(x));
        System.out.println((int)(y));
     
    }
}