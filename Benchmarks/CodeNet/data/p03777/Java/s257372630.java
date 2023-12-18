import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextInt();
        String b = sc.nextInt();

        if(a.equals("H")){
            System.out.println(b);
            
        }
        if(a.equals("D") && b.equals("D")){
            System.out.println("E");
        }
        if(a.equals("D") && b.equals("E")){
            System.out.println("D");
        }
    }

}
