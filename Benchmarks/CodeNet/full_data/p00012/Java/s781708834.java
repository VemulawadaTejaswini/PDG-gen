import java.util.Scanner;
public class Main {
	    double x;
	    double y;
	    public Main(double x,double y){
	        this.x = x;
	        this.y = y;
	        } 
	    public static boolean isInTriangle(Main A, Main B, Main C, Main P) {
	        /*利用叉乘法进行判断,假设P点就是M点*/  
	        double a = 0, b = 0, c = 0;  

	        Main MA = new Main(P.x - A.x,P.y - A.y);  
	        Main MB = new Main(P.x - B.x,P.y - B.y);  
	        Main MC = new Main(P.x - C.x,P.y - C.y);  

	        /*向量叉乘*/  
	        a = MA.x * MB.y - MA.y * MB.x;  
	        b = MB.x * MC.y - MB.y * MC.x;  
	        c = MC.x * MA.y - MC.y * MA.x;  

	        if((a <= 0 && b <= 0 && c <= 0)||  
	            (a > 0 && b > 0 && c > 0))  
	            return true;     
	        return false;  
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner in =new Scanner(System.in);
				double x1,y1,x2,y2,x3,y3,x,y;
				while(in.hasNext())
				{
					x1=in.nextDouble();
					y1=in.nextDouble();
					x2=in.nextDouble();
					y2=in.nextDouble();
					x3=in.nextDouble();
					y3=in.nextDouble();
					x=in.nextDouble();
					y=in.nextDouble();
					
					boolean result=isInTriangle(new Main(x1, y1),new Main(x2, y2),new Main(x3, y3),new Main(x, y));
					if(!result){
						System.out.println("NO");
					}
					else
						System.out.println("YES");
					
					
				}
				in.close();
		}

}
