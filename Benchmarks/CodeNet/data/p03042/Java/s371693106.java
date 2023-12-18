import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String str = sc.next();

        String left = str.substring(0,2);
        String right = str.substring(2,4);

        String massage = "NA";
        if (Integer.parseInt(left) >= 0  &&
        Integer.parseInt(right) >= 1 && Integer.parseInt(right) <= 12){
            massage = "YYMM";
        }
        if (Integer.parseInt(right) >= 0  &&
        Integer.parseInt(left) >= 1 && Integer.parseInt(left) <= 12){
            if(massage.equals("YYMM")){
                massage = "AMBIGUOUS";
            } else {
                massage = "MMYY";
            }
        }
        System.out.println(massage);
        sc.close();
    }
}