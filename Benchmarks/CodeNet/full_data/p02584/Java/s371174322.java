import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       int pos,steps,dis;
       pos = s.nextInt();
       steps = s.nextInt();
       dis = s.nextInt();
       
       if(pos<0)
       {
           pos=-pos;
       }
       if( (dis*steps)<= pos){
            System.out.println(pos-dis*steps);
       }
       else
       {
           steps= steps- (pos/dis);
           if(steps%2==0)
           {
               System.out.println(pos-dis*steps);
           }
           else
           {
               Math.min(-(pos-dis*steps-dis), (pos-dis*steps+dis) );
           }
       }
    
    }
}