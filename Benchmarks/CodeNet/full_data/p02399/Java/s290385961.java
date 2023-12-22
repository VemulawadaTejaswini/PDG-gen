import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner inp = new Scanner(System.in);

int a = inp.nextInt();
int b = inp.nextInt();

System.out.print((a/b)+" "+(a%b));
System.out.printf(" %.5f", (double) a/b);

}
}
