import java.util.Scanner;

public class Main{
    public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	double r=sc.nextInt();

        double mennseki=r*r*3.1416;
	double shuu=2*r*3.1416;
	
	System.out.println(mennseki +" "+ shuu);

    }
}