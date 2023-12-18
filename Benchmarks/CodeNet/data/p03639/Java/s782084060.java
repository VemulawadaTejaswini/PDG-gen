import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int n = scan.nextInt();
        double count = 0.0;
        for(int i = 0; i < n; i++){
            int tmp = Integer.parseInt(scan.next());
            if(tmp % 4 == 0){
                count += 1.0;
            } else if (tmp % 2 == 0){
                count += 0.5;
            }
        }

        // output
        if((int)count >= n / 2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}