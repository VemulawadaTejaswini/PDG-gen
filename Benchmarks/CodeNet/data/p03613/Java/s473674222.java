import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N == 1) {
            System.out.println("1");
            return;
        }

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> numOfX = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            integers.add(Integer.parseInt(scanner.next()));
        }
        integers.sort(Comparator.naturalOrder());

        int count = 1;
        x.add(integers.get(0));
        for (int i = 1; i < N; i++) {
            if (!x.contains(integers.get(i))) {
                x.add(integers.get(i));
                numOfX.add(count);
                count = 1;
            } else {
                count++;
            }
        }
        numOfX.add(count);

        for (int i = 0; i < x.size(); i++) {
            System.out.print(x.get(i) + ":");
            System.out.println(numOfX.get(i));
        }

        int answer = 0;

        for (int i = 0; i < x.size(); i++) {
            for (int j = -1; j < 2; j++) {

                int tmp = 0;
                int X = x.get(i) + j;

                if (x.contains(X)) {
                    tmp += numOfX.get(x.indexOf(X));
                }
                if (x.contains(X-1)) {
                    tmp += numOfX.get(x.indexOf(X-1));
                }
                if (x.contains(X+1)) {
                    tmp += numOfX.get(x.indexOf(X+1));
                }

                if (tmp > answer) {
                    answer = tmp;
                }
            }
        }

        System.out.println(answer);
    }
}
