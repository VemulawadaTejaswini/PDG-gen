import java.util.*;
import java.util.regex.Pattern;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int theta = 90; 
                double x = 0;
                double y = 0;
                String[] s = sc.nextLine().split(",");
                int r = Integer.parseInt(s[0]);
                while(r != 0){ 
                        x += r*Math.cos(Math.toRadians((double)theta));
                        y += r*Math.sin(Math.toRadians((double)theta));
                        theta = addTheta(theta,-Integer.parseInt(s[1]));
                        s = sc.nextLine().split(",");
                        r = Integer.parseInt(s[0]);
                }   
                sc.close();
                System.out.println((int)x);
                System.out.println((int)y);
        }   
        static int addTheta(int theta, int dtheta){
                theta += dtheta;
                if(theta < 0){ 
                        theta += 360;
                }else if(theta >= 360){
                        theta -= 360;
                }   
                return theta;
        }   
}