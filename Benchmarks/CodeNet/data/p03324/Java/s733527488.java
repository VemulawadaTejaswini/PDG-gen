import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String K = sc.next();
        if(N.equals("0")){
            System.out.println(K);
        }else if(N.equals("1")){
            System.out.println(K+"00");
        }else{
            System.out.println(K+"0000");
        }
   }
}