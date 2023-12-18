import java.util.Scanner;
public class Security {
public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
int S, a,b,c,d;
System.out.println();
a=teclado.nextInt();
System.out.println();
b=teclado.nextInt();
System.out.println();
c=teclado.nextInt();
System.out.println();
d=teclado.nextInt();
S=a+b+c+d;
if(a==b || b==c || c==d) {
System.out.println("bad");
}else {
System.out.println("good");
}
teclado.close();

	}

}