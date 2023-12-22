import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        List<Integer> wdaigaku = new ArrayList<>();
        List<Integer> kdaigaku = new ArrayList<>();
        for(int i = 0;i < 10; i++){
            wdaigaku.add(sc.nextInt());
        }
        for(int i = 0;i < 10; i++){
            kdaigaku.add(sc.nextInt());
        }
        Collections.sort(wdaigaku, Collections.reverseOrder());
        Collections.sort(kdaigaku, Collections.reverseOrder());

        System.out.println(wdaigaku.get(0) + wdaigaku.get(1) + wdaigaku.get(2) + " " + kdaigaku.get(0) + kdaigaku.get(1) + kdaigaku.get(2));
    }
}

