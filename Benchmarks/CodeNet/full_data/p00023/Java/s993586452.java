import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int num = input.nextInt();
    	for(int i = 0 ; i < num ; i ++){
    		double x1 = input.nextDouble();
    		double y1 = input.nextDouble();
    		double r1 = input.nextDouble();
    		double x2 = input.nextDouble();
    		double y2 = input.nextDouble();
    		double r2 = input.nextDouble();
    		System.out.println(circle(x1,y1,r1,x2,y2,r2));
    	}
    }
    
    static int circle(double x1,double y1,double r1, double x2,double y2, double r2){
    	double r = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2), 2));
    	double rl = r1+r2;
    	if(r > rl){
    		return 0;
    	}else if(r < r1){
    		return 2;
    	}else if(r < r2){
    		return -2;
    	}else{
    		return 1;
    	}
    }
}