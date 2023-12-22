import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
for(int i=1; i<=10000;i++)
{
int a= sc.nextInt();
if(a==0) break;
System.out.println("Case " + i + ": "+ a);
}

}
}
