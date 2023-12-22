import java.util.Scanner;

class Main {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a_h = sc.nextInt();
            int b_m = sc.nextInt();
            int h = sc.nextInt();
            int m = sc.nextInt();
            
            
            double dh = (h*60+m)*2*Math.PI/(12*60) ;
            double hx = a_h*Math.cos(dh) ;
            double hy = a_h*Math.sin(dh) ;
            
            double dm = m*2*Math.PI/60 ;
            double mx = b_m*Math.cos(dm) ;
            double my = b_m*Math.sin(dm) ;
            
            double dx = mx-hx ;
            double dy = my-hy ;

            double result = Math.sqrt( dx*dx+dy*dy) ;
            System.out.println(result);
      }

}