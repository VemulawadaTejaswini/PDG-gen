import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> heightList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            heightList.add(value);
        }

        int highest = 0;
        int count = 0;

        for (int height : heightList){
            if (height >= highest){
                count += 1;
                highest = height;
            }
        }

        System.out.println(count);

    }
}