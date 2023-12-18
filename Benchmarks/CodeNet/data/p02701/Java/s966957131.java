import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        List<String> l = new ArrayList<String>();
        
        String[] b = new String[n];
        for(int i=0;i<n;i++){
            b[i] = sc.next();
            if (!l.contains(b[i])) {
                l.add(b[i]);
            }
        }

        System.out.println(l.size());
    }
}