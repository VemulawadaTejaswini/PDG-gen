import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       long pos,steps,dis;
       pos = s.nextLong();
       steps = s.nextLong();
       dis = s.nextLong();
       
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