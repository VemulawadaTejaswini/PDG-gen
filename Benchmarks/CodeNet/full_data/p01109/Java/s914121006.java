import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            sc.nextLine();
            String str = sc.nextLine();


            String[] income = str.split(" ", 0);

            int sumIncome = 0;
            int aveIncome = 0;
            //        List<Integer> income = new ArrayList<>();

            for (int i = 0; i < income.length; i++) {
                sumIncome = sumIncome + Integer.parseInt(income[i]);
            }
            aveIncome = sumIncome / income.length;

            int count = 0;
            for (int i = 0; i < income.length; i++) {
                if (Integer.parseInt(income[i]) <= aveIncome) {
                    count++;
                }
            }
            System.out.println(count);
        }



    }

}

