import java.util.Scanner;
public class Main {
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        if(T.startsWith(S)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
 }   
}