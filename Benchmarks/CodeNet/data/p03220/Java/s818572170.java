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
        double hikaku = 0;
        
        for(int i=0;i<kouho;i++) {
        	kouhoH[i] = sc.nextInt();
        	kouhoH[i] =a - kouhoH[i] * 0.006;
        	//理想気温との差（絶対値）を入れる
        	kouhoH[i] = Math.abs(b-kouhoH[i]);
        	if(i==0) {
        		hikaku = kouhoH[i];
        	}else if(hikaku > kouhoH[i]) {
        		kotae = i+1;
        	}
        }
        //
        System.out.println(kotae);
        
	}

}
