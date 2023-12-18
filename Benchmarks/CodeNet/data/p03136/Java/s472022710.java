import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] L = new int[n];

        for (int i = 0; i < L.length; i++) {
            L[i] = sc.nextInt();
        }
        Arrays.sort(L);

        int sum = 0;
        for (int i = 1; i < L.length; i++) {
            sum += L[i];
        }
        if(L[0] < sum)  System.out.println("Yes");
        else System.out.println("No");
    }
}