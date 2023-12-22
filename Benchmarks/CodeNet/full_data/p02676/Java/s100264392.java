import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        String text = s.next();
        int len0 = text.length();
        if(len0>len){
            text = text.substring(0,len);
            System.out.println(text + "...");
        }else{
            System.out.println(text);
        }
    }
}