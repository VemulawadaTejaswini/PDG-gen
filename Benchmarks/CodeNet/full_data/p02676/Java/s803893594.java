import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num=sc.nextInt();
        String s=sc.next();
        
        if(s.length()<100){
            for(int i=0;i<num;i++){
            System.out.println(""+s.charAt(i));
            }
        }else{
            if (s.length()>100){
               char letra = s.charAt(0);
        
               String n= Character.toLowerCase(letra)+s.substring(s.length());
               System.out.println(""+s.substring(1,s.length())+n);
               System.out.println(""+s.length());
        }
    }
   }
}