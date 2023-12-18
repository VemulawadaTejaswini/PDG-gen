import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int Bills = scn.nextInt();
        int Sum = scn.nextInt();

        Check(Sum, Bills);
    }

    public static void Check(int Sum, int Bills){
        int TenThousand,FiveThousand,Thousand,judge;
        TenThousand=FiveThousand=Thousand=judge=0;
        int buff = Bills;

        while(Sum>=1000 && Bills>judge){
            if(Sum >= 10000 && !((buff-1) > 0 && (Sum-5000)==0)){
                Sum -= 10000;
                TenThousand++;
            }else if(Sum >= 5000 && !((buff-1) > 0 && (Sum-5000)==0)){
                Sum -= 5000;
                FiveThousand++;
            }else{ 
                Sum -= 1000;
                Thousand++;
            }
            buff--;
            judge = TenThousand + FiveThousand + Thousand;
        }


        if(Sum > 0 || Bills < judge){
            System.out.println("-1 -1 -1");
        }else {
            System.out.println(TenThousand+" "+FiveThousand+" "+Thousand);
        }
    }
}