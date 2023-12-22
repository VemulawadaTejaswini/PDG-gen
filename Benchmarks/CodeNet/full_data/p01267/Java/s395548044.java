import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n, a, b, c, x;
        while((n = scan.nextInt()) != 0){
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            x = scan.nextInt();
            int match_count = 0, create_count = 0;
            boolean same_number = false;
            ArrayList<Integer> y = new ArrayList<Integer>();

            for(int i=0; i<n; i++){
                y.add(scan.nextInt());
            }

            while(match_count < y.size() && create_count <= 10000){
                if(y.get(match_count)==x && same_number == false){
                    match_count += 1;
                    same_number = true;
                    continue;
                }
                if(same_number == true){
                    same_number = false;
                }
                x = create(a, b, c, x);
                create_count += 1;
            }

            if(match_count == y.size()){
                System.out.println(create_count);
            } else{
                System.out.println(-1);
            }
        }
    }

    public static int create(int a, int b, int c,int x){
        int result = (a * x + b)%c;
        return result;
    }
}