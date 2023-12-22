import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRecords = sc.nextInt();
        int index = numberOfRecords;
        List<Integer> values = new ArrayList<>();
        while (index > 0) {
            values.add(sc.nextInt());
            index--;
        }
        int sum = 0;
        for (int i = 0; i < numberOfRecords; i++) {
            for (int j = i + 1; j < numberOfRecords; j++) {
                sum += values.get(i) * values.get(j);
            }
        }
        System.out.print(sum);
    }
}