import java.util.*;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    int count =0;
    char one = 1;
    
    for (char c: s.toCharArray()){
        if (count == one) {
        count ++;
        }
    }
    System.out.print(count);
    }
}