import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	double[] coefX = new double[2];
    	double[] coefY = new double[2];
    	double[] num = new double[2];
    	double resultX = 0;
    	double resultY = 0;
    	while(scan.hasNextInt()){
    		for(int i = 0; i < 2; i++){
        		coefX[i] = scan.nextInt();
    			coefY[i] = scan.nextInt();
    			num[i] = scan.nextInt();
    		}
    		
    		resultX = (num[0]*coefY[1] - coefY[0]*num[1]) / (coefX[0]*coefY[1] - coefY[0]*coefX[1]);
    		resultY = (num[0]*coefX[1] - coefX[0]*num[1]) / (coefY[0]*coefX[1] - coefX[0]*coefY[1]);
    		System.out.printf("%.3f %.3f\n",resultX, resultY);
    	}
    }
}