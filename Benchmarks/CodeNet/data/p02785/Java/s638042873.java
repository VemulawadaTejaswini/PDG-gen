import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amountMonster;
        int PPspecatk;
       // int specialatk;

        amountMonster = sc.nextInt();
        PPspecatk = sc.nextInt();

        List<Integer> HP = new ArrayList<>();

        for (int i = 0; i < amountMonster; i++) {
            HP.add(sc.nextInt());
        }
        //specialatk = Collections.max(HP);
        Collections.sort(HP);

//        while (PPspecatk > 0) {
//            for (int i = 0; i < HP.size(); i++) {
//                HP.remove(HP.size()-1);
//            }
//            PPspecatk--;
//        }

        int sum = 0;
        for (int i = 0; i < HP.size() - PPspecatk; i++) {
            sum += HP.get(i);
        }

        System.out.println(sum);


    }
}