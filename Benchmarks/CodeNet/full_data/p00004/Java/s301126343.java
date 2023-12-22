import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int[] coefX = new int[2];
    	int[] coefY = new int[2];
    	int[] num = new int[2];
    	double resultX = 0;
    	double resultY = 0;
    	while(scan.hasNextInt()){
    		for(int i = 0; i < 2; i++){
        		coefX[i] = scan.nextInt();
    			coefY[i] = scan.nextInt();
    			num[i] = scan.nextInt();
    		}
    		
    		resultX = (double) (num[0]*coefY[1] - coefY[0]*num[1]) / (coefX[0]*coefY[1] - coefY[0]*coefX[1]);
    		resultY = (double) (num[0]*coefX[1] - coefX[0]*num[1]) / (coefY[0]*coefX[1] - coefX[0]*coefY[1]);
    		if(resultX == -0.000){
    			resultX = 0.000;
    		}
    		if(resultY == -0.000){
    			resultY = 0.000;
    		}
    		System.out.printf("%.3f %.3f\n",resultX, resultY);
    	}
    }
}