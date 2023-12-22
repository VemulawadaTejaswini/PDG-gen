import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s;
        s=sc.next();
        
        if(s.length()<99){
            System.out.println(""+s);
            System.out.println(""+s.length());
        }else{
            if (s.length()>99){
               char letra = s.charAt(0);
          
               String nueva= Character.toLowerCase(letra)+s.substring(s.length());
               System.out.println(""+s.substring(1,s.length())+nueva);
               System.out.println(""+s.length());
            }    
        }
    }
}