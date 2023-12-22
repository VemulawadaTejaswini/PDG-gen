import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o="";
        char x=sc.next().charAt(0);
        if((int)x>=97&&(int)x<=122)o="a";
        else o="A";
        
      System.out.println(o);
    }
    
}