    import java.util.Arrays;
import java.util.Scanner;
    public class Main {
    	 public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);

    	int n=scanner.nextInt();
    	int i=scanner.nextInt();
           	int k=scanner.nextInt();
    	int[] m=new int[n+i];

    	int t=0;
           int y=0;


    	for(int j=0;j<n;j++) {
    		int a=scanner.nextInt();
    		m[j]=a;
    	}
    	System.out.println();
           for(int j=0;j<i;j++) {
    		int a=scanner.nextInt();
    		m[j+n]=a;
    	}

    	Arrays.sort(m);

            for(int j=0;j<i+n;j++) {
    		if(t+m[j]<=k){
            t=t+m[j];
              y=y+1;
               }
              else{
              break;
              }
            }
           System.out.println(y);
    	 }
    }