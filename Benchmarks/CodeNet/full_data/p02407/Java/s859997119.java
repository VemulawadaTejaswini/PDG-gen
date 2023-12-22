import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,n;
        int array[]=new int[100];
        n=scan.nextInt();
        for(i=n-1;i>=0;i--){
        	array[i]=scan.nextInt();
        }
        for(i=0;i<n;i++) {
        	System.out.print(array[i]);
        	if(i==n-1)break;
        	System.out.print(" ");
        }
        System.out.println("");
    }
}

