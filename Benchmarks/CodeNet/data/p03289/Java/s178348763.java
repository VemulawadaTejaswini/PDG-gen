import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1="AtCoder";
        String s2=s.next();
        int count=0;
        if(s2.charAt(0)=='A'&&s2.charAt(2)=='C'){
            System.out.println("AC");
            
        }else
            System.out.println("WA");
        
    }
    
}
