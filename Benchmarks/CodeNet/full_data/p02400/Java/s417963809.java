import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		double r = scan.nextDouble();//r = ??????
		double men = (double)r * r *  3.14159265358979323846264338327950288;
		double ensyu = (double)r * 2 * 3.14159265358979323846264338327950288;

		System.out.println(String.format("%f %f", men, ensyu));
        scan.close();
    }

}