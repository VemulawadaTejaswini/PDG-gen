import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = Character.getNumericValue(scan.next().toCharArray()[0]);
        num+=1;
        System.out.println(num);
        String ans = String.valueOf((char)num);
        System.out.println(ans);
    }
}
