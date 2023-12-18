import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double centx = Math.abs((w / 2) - x);
        double centy = Math.abs((h / 2) - y);
        if(centx == centy){
        	if(h - y >= y){
            	System.out.print(y * w + " ");
            }else{
            	System.out.print((h - y) * w + " ");
            }
            System.out.println(1);
        }else{
            if(centx <= centy){
            	if(x >= w - x){
                	System.out.print((w - x) * h + " ");
                }else{
                	System.out.print(x * h + " ");
                }
            }
            System.out.println(0);
        }
	}
}