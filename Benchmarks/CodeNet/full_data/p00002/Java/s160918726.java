import java.util.Scanner;
  
public class Main {
    public static void main(String[] args){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println((String.valueOf(a+b).length()));
        }
        scanner.close();
    }
}