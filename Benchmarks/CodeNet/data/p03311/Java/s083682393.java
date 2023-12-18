
import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        int check=0;
        int  N=sc.nextInt();
        int K[]=new int[N];
        //int max=0;
        //int min=999999999;
        int some=0;
        for(int i=0;i<N;i++) {
        some+=sc.nextInt()-i-1;
        //if(K[i]+i>max) {max=K[i]+i;}
        //if(K[i]+i<min) {min=K[i]+i;}
        //some+=K[i];
        //System.out.println(K[i]);
        }
        //System.out.println(min);
       // System.out.println(max);
     /*  int sumend=999999999;
        for(int i=0;i<max;i++) {
        	 int sum=0;
        	for(int j=0;j<N;j++) {
        		sum+=Math.abs(K[j]-(i+j+1));

        	}*/
        //sSystem.out.println(i+":sum="+sum);
        	//if(sum<sumend) {sumend=sum;}
      //  }
        System.out.println(some);
	}

}
