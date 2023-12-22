import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner inp = new Scanner(System.in);
int a = inp.nextInt();
int b = inp.nextInt();

int d = a/b;
int r = a%b;
double f = a/b;

System.out.printf(d+" "+r+" %.5f",f);

}
}
