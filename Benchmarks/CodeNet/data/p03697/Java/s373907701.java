import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte a = scan.nextByte();
        byte b = scan.nextByte();
        if(a + b >= 10){
            System.out.println("error");
        }else{
            System.out.println(a + b);
        }
    }
}