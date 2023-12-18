import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] persons = new long[3*N];

        for (int i=0; i<3*N; i++) {
            persons[i] = sc.nextLong();
        }
        Arrays.sort(persons);
        
        long sum = 0;

        for (int i=N; i<3*N; i+=2) {
            sum += persons[i];
        }

        System.out.println(sum);
    }
}

