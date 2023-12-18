import java.util.Scanner;

public class Main190526 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String text = scanner.next();
            int sum = a + b + c;
            System.out.println(sum + " " + text);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
