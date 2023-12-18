import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int ac = a-c;
    int AC = Math.abs(ac);
    int ab = a-b;
    int AB = Math.abs(ab);
    int bc = b-c;
    int BC = Math.abs(bc);
    
    if(AC<=d){
    System.out.println("Yes");
    }else if(AB<=d && BC<=d){
    System.out.println("Yes");
    }else{
    System.out.println("No");   
        }
    }
}