import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3], work;
    	a[0] = sc.nextInt();
    	a[1] = sc.nextInt();
    	a[2] = sc.nextInt();
    	for(int i = 0; i < 1; i++)
        {
    			if(a[i] > a[i + 1])
    	        {
    	            work = a[i];
    	            a[i] = a[i + 1];
    	            a[i + 1] = work;
    	        }
        }
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        sc.close();
    }

}