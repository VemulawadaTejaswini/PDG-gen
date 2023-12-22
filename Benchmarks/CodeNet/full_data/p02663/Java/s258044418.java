import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int hour1 = Integer.parseInt(sc.next());
            int minute1 = Integer.parseInt(sc.next());
            int hour2 = Integer.parseInt(sc.next());
            int minute2 = Integer.parseInt(sc.next());

            int study = Integer.parseInt(sc.next());

            int difHour = 0;
            int difMinute = 0;

            if(minute2 - minute1 < 0){
                difHour = hour2 - hour1 - 1;
                difMinute = minute2 - minute1 + 60;
            }else{
                difHour = hour2 - hour1;
                difMinute = minute2 - minute1;
            }

            int sumTime = difHour*60 + difMinute;

            System.out.println(sumTime - study);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}