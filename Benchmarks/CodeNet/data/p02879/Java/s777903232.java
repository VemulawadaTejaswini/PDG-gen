import java.util.Scanner;
public class A{
    public static void main(String[] args){
	int i,j,a;
	Scanner scanner = new Scanner(System.in);
	i = scanner.nextInt();
	j = scanner.nextInt();
	if((i >= 1 && i <= 9) && (j >= 1 && j <= 9))
	    System.out.printf("%d",i * j);
	else
	    System.out.printf("-1");
	scanner.close();
    }
}   
