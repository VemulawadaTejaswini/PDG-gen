import java.util.Scanner;

public class Main{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int p = scan.nextInt();
int q = scan.nextInt();
float w = (float) p / q;
System.out.format("%d %d %f.10", p, q, w);
}
}
