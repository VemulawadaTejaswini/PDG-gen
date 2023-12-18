import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        String weeksday[]={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        Scanner sc = new Scanner(System.in);
        String todays=sc.next();
        int i=0;
        int result=0;
        boolean x= false;
        if(todays.equals("SUN")){
            result=7;
        }else{
            while(x==false){
                if(todays.equals(weeksday[i])){
                    x=true;
                }
                i++;
            }
            result=7-i;
        }
        System.out.print(result);
    }
}
