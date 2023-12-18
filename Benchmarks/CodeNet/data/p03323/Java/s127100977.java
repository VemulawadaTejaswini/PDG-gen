import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        int checkA=0;
        int checkAhigh=0;
        int checkB=0;
        int checkBrow=0;
        int A = sc.nextInt();
        int B=sc.nextInt();
        String[] N=new String[16];
        for(int z=0;z<16;z++) {
        	if(z%2==0&&checkA<A) {N[z]="A";checkA++;}
        	if(z%2==1&&checkB<B) {N[z]="B";checkB++;}
        	
        }
        
        if(checkA==A&&checkB==B) {System.out.println("Yay!");}
        else {System.out.println(":(");}
	}

}
