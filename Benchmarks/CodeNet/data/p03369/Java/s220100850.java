import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int price = 700;
        if(s.charAt(0)=='o'){
            price +=100;
        }
        if(s.charAt(1)=='o') {
            price += 100;
        }
        if(s.charAt(2)=='o'){
            price+=100;
        }
        System.out.println(price);
    }
}
