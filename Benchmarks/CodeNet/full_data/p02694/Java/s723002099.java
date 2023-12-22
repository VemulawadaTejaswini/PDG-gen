import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        boolean flag = true;
        int count =0;
        double deposit = 100.0;
        while(flag){
            deposit = Math.floor(deposit*1.01);
            count++;
            if(deposit>=X){
                System.out.println(count);
                break;
            }
        }
    }
}