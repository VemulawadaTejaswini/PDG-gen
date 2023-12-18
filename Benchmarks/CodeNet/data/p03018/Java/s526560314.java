import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;
        
        while(s.contains("ABC")){
            s = s.replaceFirst("ABC", "BCA");
            count++;
        }
        System.out.println(count);
        
    }
}
