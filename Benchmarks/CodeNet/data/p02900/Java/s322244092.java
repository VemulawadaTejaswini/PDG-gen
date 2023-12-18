import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> commonDivistors = commonDivistors(a, b);

        System.out.println(prime(commonDivistors).size());
    }

    private static List<Integer> prime(List<Integer> commons) {

        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < commons.size(); i++) {

            List<Integer> list = new ArrayList<>();
            for(int j = 1; j <= commons.get(i); j++) {
                if(commons.get(i) % j == 0) {
                    list.add(j);
                } 
            }

            if(list.size() <= 2) {
                primes.add(commons.get(i));
            }
        }

        return primes;
    }

    private static List<Integer> commonDivistors(int a, int b) {
        List<Integer> aList = divistors(a);
        List<Integer> bList = divistors(b);
        
        List<Integer> commonDivistors = new ArrayList<>();
        for (int i : aList) {
            if (bList.contains(i)) {
                commonDivistors.add(i);
            }
        }
        return commonDivistors;
    }

    private static List<Integer> divistors(int number) {
        List<Integer> divistors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number%i == 0) {
                divistors.add(i);
            }
        }
        return divistors;
    }
}