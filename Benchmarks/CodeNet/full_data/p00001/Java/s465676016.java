import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] arg){
	Scanner cin = new Scanner(System.in);
	int[] a = new int[10];
	int[] c = new int[10];
	for(int i=0; i<10; i++){
		a[i] = cin.nextInt();
		c[i] = a[i];
	}

	Arrays.sort(a);

	for(int i=1; i<=3; i++){System.out.println(a[a.length-i]);}
   }
}