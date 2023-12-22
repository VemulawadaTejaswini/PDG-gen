import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner inp = new Scanner(System.in);
int a = inp.nextInt();
int b = inp.nextInt();

int i = a/b;
int j = a%b;
double k = a/b;

System.out.printf(i+" "+j+" %.5f",k);

}
}
