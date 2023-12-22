import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        
        double x = Double.parseDouble(line1);
        
        long yokin = 100;
        int count = 0;
        while(yokin < x)
        {
            int risi = (int)(yokin * 0.01);
            yokin = yokin + risi;
            count++;
        }
        
        System.out.println(count);
    }
}
