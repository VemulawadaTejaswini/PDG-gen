import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int blue = sc.nextInt();

        List<String> blueList = new ArrayList<>();
        for (int i = 0; i < blue; i++) {
            blueList.add(sc.next());
        }

        int red = sc.nextInt();
        List<String> redList = new ArrayList<>();
        for (int i = 0; i < red; i++) {
            redList.add(sc.next());
        }

        Set<String> set = new HashSet<>(blueList);

        int maxPoint = 0;
        for (String str :set){
            int point = 0;

            for (int i = 0; i < blue; i++) {
                if(Objects.equals(str, (blueList.get(i)))){
                    point++;
                }
            }

            for (int i = 0; i < red; i++) {
                if(Objects.equals(str, (redList.get(i)))){
                    point--;
                }
            }

            if(maxPoint < point){
                maxPoint = point;
            }
        }

        System.out.println(maxPoint);
    }
}
