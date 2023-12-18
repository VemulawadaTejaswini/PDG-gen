import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long lNmb = 0;
        int n = in.nextInt();

        ArrayList<Long> lucasNumbers = new ArrayList<>();
        lucasNumbers.add(0, (long) 2);
        lucasNumbers.add(1, (long) 1);

        if(n >= 3){
            for(int x = 2; x <= n; x++){
                lucasNumbers.add(x, lucasNumbers.get(x - 2) + lucasNumbers.get(x - 1));
                lNmb = lucasNumbers.get(lucasNumbers.size() - 1);
            }
        } else if(n == 1) lNmb = 2;
        else if(n == 2) lNmb = 1;

        System.out.println(lNmb);
    }
}
