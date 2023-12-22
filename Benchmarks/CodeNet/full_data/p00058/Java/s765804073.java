

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 

public class Main{
          
     public static void main(String[] args) {
 
    final Scanner stdin = new Scanner(System.in);
 
    while ( stdin.hasNextLine() ) {
        String[] input = stdin.nextLine().split( " " );
 
        final double xA = Double.parseDouble( input[0] );
        final double yA = Double.parseDouble( input[1] );
        final double xB = Double.parseDouble( input[2] );
        final double yB = Double.parseDouble( input[3] );
        final double xC = Double.parseDouble( input[4] );
        final double yC = Double.parseDouble( input[5] );
        final double xD = Double.parseDouble( input[6] );
        final double yD = Double.parseDouble( input[7] );
 
        final double v1x = xA - xB;
        final double v1y = yA - yB;
        final double v2x = xC - xD;
        final double v2y = yC - yD;
 
        if ( v1x * v2x + v1y * v2y == 0.0 ) {
        System.out.println( "YES" );
        } else {
        System.out.println( "NO" );
        }       
    }   
    } 
    
    public static void main3(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
 
        while ((line = br.readLine()) != null) {
            double ax, ay, bx, by, cx, cy, dx, dy;
            String points[] = line.split(" ");
 
            ax = Double.parseDouble(points[0]);
            ay = Double.parseDouble(points[1]);
            bx = Double.parseDouble(points[2]);
            by = Double.parseDouble(points[3]);
            cx = Double.parseDouble(points[4]);
            cy = Double.parseDouble(points[5]);
            dx = Double.parseDouble(points[6]);
            dy = Double.parseDouble(points[7]);
 
            if (ax == bx && cy == dy) {
                System.out.println("YES");
            } else if (ay == by && cx == dx) {
                System.out.println("YES");
            } else if ((ay - by) * (cy - dy) * -1 == (ax - bx) * (cx - dx)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
     
     public static void main2(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
            
             while((line=br.readLine())!= null){//if(line.isEmpty())break;
                String[] spl=line.split(" ");
                double xa=Double.parseDouble(spl[0]);
                double ya=Double.parseDouble(spl[1]);
                double xb=Double.parseDouble(spl[2]);
                double yb=Double.parseDouble(spl[3]);
                double xc=Double.parseDouble(spl[4]);
                double yc=Double.parseDouble(spl[5]);
                double xd=Double.parseDouble(spl[6]);
                double yd=Double.parseDouble(spl[7]);

                if (xa == xb && yc == yd) {
                    System.out.println("YES");
                } else if (ya == yb && xc == xd) {
                    System.out.println("YES");
                } else if ((ya - yb) * (yc - yd) * -1 == (xa - xb) * (xc - xd)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                
                
                /*if((yb-ya)*(yd-yc)==-1*(xb-xa)*(xd-xc)    )// dy1/dx1 * dy2/dx2 = -1 -> dy1*dy2 = -dx1*dx2
                 System.out.println("YES");
                else System.out.println("NO");
                 */
                
             }br.close();
             
         }catch(Exception e){e.printStackTrace();}         
     }
   
 }