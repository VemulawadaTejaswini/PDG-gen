import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int age = stdIn.nextInt();
        
        //int c = stdIn.nextInt();
        //int k = stdIn.nextInt();
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean heisei = true;
        
        if(age == 1){
            System.out.println("Hello World");
        }else{
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            System.out.println(a + b);
        }
        
        
        
        //System.out.println();
        //System.out.print();
    }
}
