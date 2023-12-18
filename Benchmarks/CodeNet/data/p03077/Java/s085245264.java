import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        long[] cap = new long[5];

        int bottleIdx = -1;
        long min = Long.MAX_VALUE;

        for(int i=0; i<5; i++){
            cap[i] = scanner.nextLong();
            if(cap[i] < min){
                bottleIdx = i;
                min = cap[i];
            }
        }

        long time = 0;

        time += 4;


        time += (N / cap[bottleIdx]);

        if(N%cap[bottleIdx] != 0){
            time++;
        }

        System.out.println(time);

    }
}
