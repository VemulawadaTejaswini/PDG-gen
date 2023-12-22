import java.util.*;


class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] ls = new int[sc.nextInt()];

        ls[0] = sc.nextInt();
        ls[1] = sc.nextInt();

        int maxProfit = ls[1] - ls[0];

        int index = 2;
        while(sc.hasNextInt()){
            int next = sc.nextInt();


            for(int i = 0; i < index; i++) {
                int profit = next - ls[i];
                maxProfit = Math.max(profit, maxProfit);
            }

            ls[index] = next;
            index++;
        }


        System.out.println(maxProfit);
    }
}

