import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while(true){
            int count = scn.nextInt();

            if(count == 0) break;

            int [] array;
            array = new int[count];

            int sum = 0;
            Double ave = 0.0;
            Double ans = 0.0;
            Double answer = 0.0;


            for(int i = 0; i < count; i++){
                array[i] = scn.nextInt();
                sum += array[i];
            }

            ave = Double.valueOf(sum) / Double.valueOf(count);

            for(int i = 0; i < count; i++){
                ans += (array[i] - ave) * (array[i] - ave);
            }
            ans /= count;
            answer = Math.sqrt(ans);

            System.out.println(String.format("%.8f", answer));

        }
    }
}

