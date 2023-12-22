import java.util.Scanner;

public class Main{

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
int p = scan.nextLine();
int q = scan.nextLine();
int w = scan.nextLine();
int counter = 0;
for (int i = p; i <= q;  i ++ ) {
if ( w % i == 0) {
counter++;
}
}
System.out.println(counter);

}
}

