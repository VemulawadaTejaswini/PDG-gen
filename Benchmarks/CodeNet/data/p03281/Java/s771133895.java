import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        //String N=sc.next();
        int A = sc.nextInt();
        //int B = sc.nextInt();
        int count=0;
        int last=0;
        for(int k=1;k<=A;k=k+2) {
        	//System.out.println(k);
        for(int i=1;i<=k;i++) {
        	if(k%i==0) {count++;}
        }
        if(count==8) {last++;
        //System.out.println(k+"=8count");
        }
        count=0;
        }
        System.out.println(last);

	}

}