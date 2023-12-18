import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean enable=false;
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.contains("7")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");  
        }
        
    }

}