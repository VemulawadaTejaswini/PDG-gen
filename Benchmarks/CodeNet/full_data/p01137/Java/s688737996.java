import java.util.Scanner;

/**
 * Created by kazuki on 2014/07/04.
 */
public class Main{
   static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int e,x,y,z;
        int tmp,min;

        while(true){
            e = s.nextInt();
            min=e;

            if(e==0) break;

            for(z=0;z*z*z<=e;z++){
                tmp=e-z*z*z;
                for (y=0;y*y<=tmp;y++){
                    x=tmp-y*y;
                    if(min>x+y+z) min=x+y+z;
                }
            }

            System.out.println(min);
        }


    }
}