import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        String str = scanner.next();
        int valLen = str.length(); 
        String i = str.substring(0,a);
        if(valLen <= a){
            System.out.println(str);
        }else{
            System.out.println(i + "...");
        }
    }
}