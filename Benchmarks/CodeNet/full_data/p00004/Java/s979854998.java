import java.util.Scanner;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	float[] coefX = new float[2];
    	float[] coefY = new float[2];
    	float[] num = new float[2];
    	float resultX = 0;
    	float resultY = 0;
    	while(scan.hasNextInt()){
    		for(int i = 0; i < 2; i++){
        		coefX[i] = scan.nextInt();
    			coefY[i] = scan.nextInt();
    			num[i] = scan.nextInt();
    		}
    		for(int i = 0; i < 2; i++){
    			if(coefX[i] == 0 && coefY[i] != 0){
        			resultY = num[i] / coefY[i];
        			if(i == 0){
        				if(coefY[1] == 0){
        					resultX = num[1] / coefX[1];
        				}else{
        					resultX = (num[1]-coefY[1]*resultY) / coefX[1];
        				}
        			}else{
        				if(coefY[0] == 0){
        					resultX = num[0] / coefX[0];
        				}else{
        					resultX = (num[0]-coefY[0]*resultY) / coefX[0];
        				}
        			}
        			break;
        		}else if(coefX[i] != 0 && coefY[i] == 0){
        			resultX = num[i] / coefX[i];
        			if(i == 0){
        				if(coefX[1] == 0){
        					resultY = num[1] / coefY[1];
        				}else{
        					resultY = (num[1]-coefX[1]*resultX) / coefY[1];
        				}
        			}else{
        				if(coefX[0] == 0){
        					resultY = num[0] / coefY[0];
        				}else{
        					resultY = (num[0]-coefX[0]*resultX) / coefY[0];
        				}
        			}
        			break;
        		}else if(i == 1){
        			float baisu = coefX[1] / coefX[0];
            		coefX[0] *= baisu; coefY[0] *= baisu; num[0] *= baisu;
            		coefY[0] = coefY[0] - coefY[1]; num[0] = num[0] - num[1];
            		resultY = num[0] / coefY[0];
            		resultX = (num[1] - coefY[1]*resultY) / coefX[1];
        		}
    		}
    		
    		BigDecimal X = (new BigDecimal(resultX)).setScale(3, BigDecimal.ROUND_HALF_UP);
    		BigDecimal Y = (new BigDecimal(resultY)).setScale(3, BigDecimal.ROUND_HALF_UP);
    		System.out.printf("%.3f %.3f",X.floatValue(), Y.floatValue());
    	}
    }
}