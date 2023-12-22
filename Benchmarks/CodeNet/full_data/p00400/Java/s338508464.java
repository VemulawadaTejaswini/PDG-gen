import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte n = scan.nextByte();
        if(65 <= n && n <= 90){
            System.out.println(1);
        }else if(97 <= n && n <= 122){
            System.out.println(2);
        }else{
            System.out.println(0);
        }
        scan.close();
    }
}
