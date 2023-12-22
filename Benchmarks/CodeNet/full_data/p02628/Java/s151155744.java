import java.util.*;

 class Fruits {

    public static void main(String[] args) {
        int c =0;
        ArrayList<Integer> A = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int p;

        while (n != 0) {
            p = input.nextInt();
            A.add(p);
            n--;
        }
        Collections.sort(A);

        for (int i = 0; i < k; i++) {

            c += A.get(i);
            }
        System.out.println(c);
        }

    }
