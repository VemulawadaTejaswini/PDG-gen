import java.util.*;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
       
       try {
        String x =sc.Int();
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date date = sdFormat.parse(strDate);
     
        String str = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
       if(str<=2019/04/30){
           System.out.println("Heisei");
       }else{
           System.out.println("TBD")
       }
     
    } catch (ParseException e) {
        e.printStackTrace();
    }
    }
}