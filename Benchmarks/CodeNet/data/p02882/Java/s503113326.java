import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double p = (2.0 * a*a*b-2.0*x)/(1.0*a*a);
        double radian = Math.atan(p/a);
        if(a*a*b / 2.0 > x)
            radian = Math.PI / 2.0 - Math.atan(2.0*x/(a*b*b));
        System.out.println(Math.toDegrees(radian));
    }
}