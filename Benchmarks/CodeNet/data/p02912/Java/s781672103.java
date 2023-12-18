import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigDecimal;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> pList = new ArrayList<>();

        for(int i = 0; i < N; i++){
            pList.add(sc.nextInt());
        }

        for(int x = 0; x < M; x++) {
            ArrayList<Integer> rList = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int base = pList.get(i);

                if (rList.size() == 0) {
                    rList.add(base);
                    continue;
                }

                boolean is = false;
                for (int j = 0; j < rList.size(); j++) {
                    int compare = rList.get(j);

                    if (base > compare) {
                        is = true;
                        rList.add(j, base);
                        break;
                    }
                }

                if(!is) {
                    rList.add(base);
                }
            }

            for(int i = 0 ; i < N; i++){
                pList.set(i, rList.get(i));
            }


            BigDecimal y = new BigDecimal(pList.get(0) / 2);
            pList.set(0, Integer.parseInt(y.toPlainString()));
        }

        long sum = 0;
        for(int p : pList){
            sum += p;
        }

        System.out.println(sum);
    }
}