import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = s + s;
        String p = scanner.nextLine();
        if(s1.contains(p)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
