import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1="AtCoder";
        String s2=s.next();
        if(s2.charAt(0)=='A'&&s2.charAt(2)=='C'&&s2.equals(s1)){
            System.out.println("AC");
        }else
            System.out.println("WA");
        
    }
    
}
