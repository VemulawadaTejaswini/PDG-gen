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

        Long s1;
        Long s2;
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
        else{

        }

        
    }
}