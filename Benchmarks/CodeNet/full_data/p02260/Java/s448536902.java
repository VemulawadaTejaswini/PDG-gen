import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numberArray = new int[n];

        for (int i = 0; i < n; i++){
            numberArray[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++){
            int minIndex = i;
            for (int j = i; j < n; j++){
                if (numberArray[j] < numberArray[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int before = numberArray[i];
                numberArray[i] = numberArray[minIndex];
                numberArray[minIndex] = before;
                count++;
            }
        }

        StringJoiner sj = new StringJoiner(" ");
        Arrays.stream(numberArray).forEach(i -> sj.add(String.valueOf(i)));
        System.out.println(sj.toString());
        System.out.println(count);

    }

}
