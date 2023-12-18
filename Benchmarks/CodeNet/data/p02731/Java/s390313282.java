import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String input_line = sc.nextLine();
        double L=Double.parseDouble(input_line);
        double L_tmp=L;
        double W=0;
        double W_tmp=0;
        double i=0,j=0;
        for(i=0;i<L_tmp;i+=0.01) {
        	for(j=0;L_tmp>i+j;j+=0.01) {
        		L=L_tmp-i-j;
        		W=i*j*L;
        		if(W_tmp<W) {
        			W_tmp=W;
        		}
        	}
        }
        System.out.print(W_tmp);
	}

}
