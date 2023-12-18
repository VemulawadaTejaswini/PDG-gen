import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        if(s.contains("ABC")){
            System.out.println("ARC");
        }else{
            System.out.println("ABC");
        }
    }
}