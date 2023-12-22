import java.util.Scanner;

public class Main{

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int p = scan.nextInt();
int q = scan.nextInt();
int w = p / q;
int c = p % q;
float r = (float) p / q;

System.out.println(w + " " + c + " " + r);
}
}

