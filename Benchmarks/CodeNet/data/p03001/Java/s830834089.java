import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double W = sc.nextInt();
        double H = sc.nextInt();
        double x = sc.nextInt();
        double y = sc.nextInt();
        double S =  W*H;
        double min = 0;double min2= 0;
        double max = 0;
      
      double x1 = W*(H-y);
      double x2 = S-x1;
      min = Math.min(x1,x2);

      double y1 = (W-x)*H;
      double y2 = S-y1;
      min2 = Math.min(y1,y2);
      
      if(min==0&min2==0){System.out.print(min+" "+0);}
      else if(min==min2){System.out.print(min+" "+1);}
      else{
      	max = Math.max(min,min2);
        System.out.print(max+" "+0);
      }

      
    }
}