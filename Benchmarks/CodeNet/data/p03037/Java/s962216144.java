import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int card_num = Integer.valueOf(input[0]);
        int gate_num = Integer.valueOf(input[1]);

        int gate_min = Integer.MIN_VALUE;
        int gate_max = Integer.MAX_VALUE;

        for(int i = 0; i < gate_num; i++) {
            String[] allow_gate = scanner.nextLine().split(" ");
            int min = Integer.valueOf(allow_gate[0]);
            int max = Integer.valueOf(allow_gate[1]);

            if(min > gate_min) gate_min = min;
            if(max < gate_max) gate_max = max;
        }
        System.out.println(gate_max - gate_min + 1);
    }
}