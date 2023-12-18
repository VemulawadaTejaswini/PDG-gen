import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> x=new ArrayList<Integer>();
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            x.add(scanner.nextInt());
        }
        for(int i=0;i<n;i++){
            List list2 = ((List) ((ArrayList) x).clone());
            list2.remove(i);
            System.out.println((Collections.max(list2)));

        }



    }
}
