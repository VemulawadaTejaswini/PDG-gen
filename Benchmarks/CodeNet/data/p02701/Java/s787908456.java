import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<String> ar = new ArrayList<>();
        
        String s = scan.nextLine();


        for (int i = 0; i < n; i++) {
            s = scan.nextLine();
            ar.remove(s);
            ar.add(s);
        }


        System.out.println(ar.size());
 
        scan.close();
    }
}
