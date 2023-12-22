import java.util.Scanner;
import java.lang.StringBuffer;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String base = input.nextLine();
        int times = input.nextInt();
        for(int i = 0; i < times; i ++ ){
            String operation = input.next();
            if(operation.compareTo("print") == 0){
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(base.substring(a, b + 1));
            }
            if(operation.compareTo("reverse") == 0){
                int a = input.nextInt();
                int b = input.nextInt();
                StringBuffer buffer1 = new StringBuffer(base.substring(a, b + 1));
                StringBuffer buffer2 = new StringBuffer(base);
                buffer1.reverse();
                buffer2.replace(a, b + 1, buffer1.toString());
                base = buffer2.toString();
            }
            if(operation.compareTo("replace") == 0){
                int a = input.nextInt();
                int b = input.nextInt();
                String change = input.next();
                StringBuffer buffer = new StringBuffer(base);
                buffer.replace(a, b + 1, change);
                base = buffer.toString();
            }
        }
    }
}
