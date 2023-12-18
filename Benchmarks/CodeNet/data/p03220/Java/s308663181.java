import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int kouho = sc.nextInt();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        double[]  kouhoH ;
        kouhoH = new double[kouho];
        
        int kotae = 1;
        
        
        for(int i=0;i<kouho;i++) {
        	kouhoH[i] = sc.nextInt();
        	kouhoH[i] =a - kouhoH[i] * 0.006;
        	kouhoH[i] = b-kouhoH[i];
        }
        double hikaku = 0;
        for(int j=0; j<kouho;j++) {
        	if(j==0) {
        		hikaku=Math.abs(kouhoH[j]);
        	}
        	if(hikaku>Math.abs(kouhoH[j])) {
        		kotae = j+1;
        	}
        }
        System.out.println(kotae);
        
	}

}
