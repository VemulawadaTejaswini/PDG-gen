
import java.util.*;

public class Main{
    static final int last_month=4280;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w;
        int this_month;

        while((w=sc.nextInt())!=-1){
            this_month=0;

            this_month+=1150;               //phase1
            
            if(10<w && w<=20){              //phase2
                this_month+=(w-10)*125;
            }
            
            if(20<w && w<=30){              //phase3
                this_month+=10*125;                
                this_month+=(w-20)*140;
            }
            
            if(30<w){                       //phase4
                this_month+=10*125;                
                this_month+=10*140;
                this_month+=(w-30)*160;
            }

            System.out.println(last_month-this_month);
        }
    }
}
