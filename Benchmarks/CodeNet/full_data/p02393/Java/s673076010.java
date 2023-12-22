	import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();

	int array[] = {a, b, c };
	Arrays.sort(array);
          System.out.println(Arrays.toString(array));

    }
}