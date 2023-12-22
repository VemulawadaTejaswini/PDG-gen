import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	int[] a = new int[num];
	int sum=0;
	
	for(int i=0;i<num;i++){
	    a[i] = in.nextInt();
	}

	Arrays.sort(a);

	int max = a[a.length-1];
	int min = a[0];

	for(int i=0;i<a.length;i++){
	    sum += a[i];
	}

	System.out.println(min + " " + max + " " +sum);
    }
}

