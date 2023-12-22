import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, q;

        n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        q = sc.nextInt();

        for(int i = 0; i < q; i++){
            a = replace(a, sc);
            int sum = 0;
            for(int j = 0; j < a.size(); j++){
                sum += a.get(j);
            }
            System.out.println(sum);
        }
        sc.close();
    }

    public static List<Integer> replace(List<Integer> a, Scanner sc){
        int b, c;
        b = sc.nextInt();
        c = sc.nextInt();
        for(int j = 0; j < a.size(); j++){
            if(a.get(j) == b){
                a.set(j, c);
            }
        }

        return a;
    }
} 
