/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);
    static StringTokenizer st;
    
    static String next()
        {
            while(st==null || !st.hasMoreElements()) 
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
   static int gcd(int a,int b)
     {
       if(b==0)
        return a;
       else
        return gcd(b,a%b);
     }
    static int calcAngle(double h, double m) 
    { 
        // validate the input 
        if (h <0 || m < 0 || h >12 || m > 60) 
            System.out.println("Wrong input"); 
  
        if (h == 12) 
            h = 0; 
        if (m == 60)  
            m = 0; 
  
        // Calculate the angles moved by hour and minute hands 
        // with reference to 12:00 
        int hour_angle = (int)(0.5 * (h*60 + m)); 
        int minute_angle = (int)(6*m); 
  
        // Find the difference between two angles 
        int angle = Math.abs(hour_angle - minute_angle); 
  
        // smaller angle of two possible angles 
        angle = Math.min(360-angle, angle); 
  
        return angle; 
    } 
   static float cal_cos(float n) 
    { 
        float accuracy = 0.0000001f, x1; 
        float denominator, cosx, cosval; 
      
        // Converting degrees to radian 
        n = n * (3.142f / 180.0f); 
      
        x1 = 1; 
      
        // Maps the sum along the series 
        cosx = x1; 
      
        // Holds the actual value of sin(n) 
        cosval = (float)Math.cos(n); 
        int i = 1; 
        do { 
            denominator = 2 * i * (2 * i - 1); 
            x1 = -x1 * n * n / denominator; 
            cosx = cosx + x1; 
            i = i + 1; 
        } while (accuracy <=  
               Math.abs(cosval - cosx)); 
      
        return cosx; 
    } 
      
    // Function to find third side 
    static float third_side(int a,  
                    int b, float c) 
    { 
        float angle = cal_cos(c); 
          
        return (float)Math.sqrt((a * a) + 
            (b * b) - 2 * a * b * angle); 
} 
  public static void main (String[] args) throws java.lang.Exception
   {
	try{
	   
		  int a=Integer.parseInt(next());
		  int b=Integer.parseInt(next());
		  double h=Double.parseDouble(next());
		  double m=Double.parseDouble(next());
		  
		  float angle=(float)calcAngle(h,m);
		  float side=third_side(a,b,angle);
		      
		 System.out.println(side);  
		    
	   }     
	catch(Exception e)
		 {}
	}
}
