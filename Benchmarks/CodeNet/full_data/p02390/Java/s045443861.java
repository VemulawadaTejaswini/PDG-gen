import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if(a >= 0 && a < 86400){
	    double h = a / 3600;
	    double m = a % 3600 / 60;
	    double s = a % 60;
        }
	System.out.println(h+":"+m+":"+s);
    }
}