import java.util.Scanner;
 
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double r = sc.nextInt();
double pi = Math.PI;
double area = r * r * pi;
double round = 2 * r * pi;
System.out.printf("%3d %3d",area,round);

}
}
 