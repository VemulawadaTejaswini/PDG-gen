import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int x = sc.nextInt(); 
        
        WaterBottle wb = new WaterBottle(a, b, x);
        
        System.out.println(wb.search());
        
    }
    
}

class WaterBottle {
    private int a;
    private int b;
    private int x;
    
    public WaterBottle(int a, int b, int x){
        this.a = a;
        this.b = b;
        this.x = x;
    }
    
    public boolean judge(double Theta){
        
        double cos = Math.cos(Math.toRadians(Theta));
        double sin = Math.sin(Math.toRadians(Theta));
        
        if( (a * cos / sin) <= (double)b){
            return (  a * a * b - cos * a * a * a / sin / 2  >= (double)x);
        } else{
            return (a * b * b * sin / cos / 2 >= (double)x);
        }
        
    }
    
	public double search() {
		double left = 0;
		double right = 90;
		for(int i = 0; i <= 100; i++){
			double mid = (left + right) / 2;
			
			if(judge(mid)){
			    // 溢れなかったのでより小さい角度
			    right = mid;
			}else{
			    // 溢れたのでより大きい角度
			    left = mid;
			}
		}
		return 90.0 - right;
	}
    
}

