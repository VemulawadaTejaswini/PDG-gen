import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        byte time = (byte)(a + b);
        if(time >= 24){
            time = (byte)(time - 24);
        }
        System.out.println(time);
    }
}