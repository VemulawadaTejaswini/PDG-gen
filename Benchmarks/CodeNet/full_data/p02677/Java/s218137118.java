
import java.util.*;


 
public class Main {

    public static void main(String args[])  {
    	Scanner sc = new Scanner(System.in);
    	double shortA=sc.nextInt();
    	double longB =sc.nextInt();
    	double time=sc.nextInt();
    	double minute=sc.nextInt();
    	double all=360;
    	double ans=0.0;
        double timeMinute=60.0*time+minute;
        double shortaa=(timeMinute/720.0)*360;
        double longaa =minute*6;
        double angle=0.0;
        if(shortaa<longaa) {
        	angle=longaa-shortaa;
        }else {
        	angle=shortaa-longaa;
        } 

  
        if(angle==360.0) {
        	angle=0.0;
        }
        else if(angle>180.0) {
        	angle=360.0-angle;
        }
     
        double cos = Math.cos(Math.toRadians(angle));
         ans= Math.sqrt( Math.pow(shortA, 2)+Math.pow(longB, 2)-2.0*shortA*longB*cos);

  
        System.out.println(ans);


    }
}