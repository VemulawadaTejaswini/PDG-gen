import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{

	public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
   	    try{
   	    for(int i = 0;i<2;i++){
          String buf = br.readLine();
          int a,b,c,d,e,f;
          String[] co = buf.split("\\s");
          a = Integer.parseInt(co[0]);
          b = Integer.parseInt(co[1]);
          c = -1*Integer.parseInt(co[2]);
          d = Integer.parseInt(co[3]);
          e = Integer.parseInt(co[4]);
          f = -1*Integer.parseInt(co[5]);
          double x = -((c*(a*e-b*d)-b*(a*f-d*c))/(a*(a*e-b*d)));
          double y = -(a*f-c*d)/(a*e-b*d);
          String strx = String.format("%.3f",x);
          String stry = String.format("%.3f",y);
          System.out.println(strx+" "+stry);
   	    }
   	    }catch(Exception e){
   	    	
   	    }
	}
}