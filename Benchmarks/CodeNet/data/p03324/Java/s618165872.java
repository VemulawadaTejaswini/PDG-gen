import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        int A = sc.nextInt();
        int B=sc.nextInt();
        int[] check=new int[B+1];
        int i=1;
        while(i<=B) {
        	if(A==0) {check[i]=i;}
        	else{check[i]=(int)(Math.pow(100,A))*i;}
        	i++;

        }
        System.out.print(check[i-1]);
	}

}