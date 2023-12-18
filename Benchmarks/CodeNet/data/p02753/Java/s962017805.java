import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] data = line.split("");
        if(data[0].equals(data[1]) && data[0].equals(data[2])){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}