import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1="AtCoder";
        String s2=s.next();
        if(s1.contains(s2)){
            System.out.println("AC");
        }else
            System.out.println("WA");
        
    }
    
}
