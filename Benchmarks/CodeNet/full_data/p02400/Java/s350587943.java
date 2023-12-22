import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner inp = new Scanner(System.in);

double r = inp.nextDouble();

double luas = Math.PI*Math.pow(r, 2);
double keliling = Math.PI*2*r;

System.out.println(luas+" "+keliling);

}
}
