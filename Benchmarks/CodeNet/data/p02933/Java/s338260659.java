import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int num = Integer.valueOf(line).intValue();

        if(num >= 3200){
            line = sc.nextLine();
            System.out.println(line);
        }else{
            System.out.println("red");
        }
    }
}