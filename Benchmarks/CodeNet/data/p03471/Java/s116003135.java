import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner pct = new Scanner(System.in);
        int n = pct.nextInt();
        int y = pct.nextInt();
        pct.close();
        int demo = y;
        boolean ebishu = true;
        for(int i = 0 ; i <= demo / 10000 && ebishu ; i++){
            for(int j = 0 ; j <= demo / 5000 && ebishu ; j++){
                demo = y - i * 10000 - j * 5000;
                if(i + j + demo / 1000 == n && demo >= 0){
                    System.out.println(i + " " + j + " " + demo / 1000);
                    ebishu = false;
                }
                demo = y;
            }
            demo = y;
        }
        if(ebishu){
            System.out.println("-1 -1 -1");
        }
    }
}