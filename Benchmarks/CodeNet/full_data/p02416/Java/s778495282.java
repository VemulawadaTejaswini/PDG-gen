import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       while(true){
           String s = sc.next();
           if(s.equals("0"))
             break;
           int answer = 0;
           for(int i=0; i< s.length(); i++){
               answer += Character.digit(s.charAt(i), 10);
           }  
           System.out.println(answer);

       }
    }
}
