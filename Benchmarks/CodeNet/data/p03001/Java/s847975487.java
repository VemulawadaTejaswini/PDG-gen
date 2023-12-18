import java.util.*;
public class Main {

    public static float calc_s(int w, int h)
    {
        return (float)w*(float)h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w, h, x, y;
        w = sc.nextInt();
        h = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        float s1;
        float s2;
        float s3;
        float s4;
        if(w/x == 2 && h/y == 2 )
        {  
            System.out.println(calc_s(x,h)+" "+1);
        }
        else if(w/x == 2)
        {
            System.out.println(calc_s(x,h)+" "+0);
        }
        else if(h/y == 2)
        {
            System.out.println(calc_s(w,y)+" "+0);
        }
        else if(x/y == h/w)
        {
            if(x == w/2 && y == h/2)
            {
                System.out.println(calc_s(w,h)/2+" "+1);
            }
            else{
                System.out.println(calc_s(w,h)/2+" "+0);
            }
        }
        else{
            s1=calc_s(x,h);
            s2=calc_s(w-x,h);
            s3=calc_s(w,y);
            s4=calc_s(w,h-y);
            if(s1>s2){
                if(s3 > s4)
                {
                    if(s2>s4)
                    {
                        System.out.println(s2 + " " +0);
                    }
                    else{
                        System.out.println(s4 + " " +0);
                    }
                }
                else
                {
                    if(s2>s3)
                    {
                        System.out.println(s2 + " " +0);
                    }
                    else{
                        System.out.println(s3 + " " +0);
                    }
                }
            }
            else{
                if(s3 > s4)
                {
                    if(s1>s4)
                    {
                        System.out.println(s1 + " " +0);
                    }
                    else{
                        System.out.println(s4 + " " +0);
                    }
                }
                else
                {
                    if(s2>s3)
                    {
                        System.out.println(s1 + " " +0);
                    }
                    else{
                        System.out.println(s3 + " " +0);
                    }
                }
            }
        }

        
    }
}