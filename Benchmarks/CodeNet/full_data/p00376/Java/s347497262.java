
import java.util.*;

class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int migi = sc.nextInt();
        int hidari = sc.nextInt();
        int a = 0;
        if (migi < hidari) {
            a = hidari - migi;
        } else if (hidari<migi)
        a=migi-hidari;{
        
        
            System.out.println(a);
        }

    }
}

