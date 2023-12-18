import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        Arrays.sort(s, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (i%2==0) {
                sum += Integer.parseInt(s[i]);
            } else {
                sum -= Integer.parseInt(s[i]);
            }
        }

        System.out.println(sum);
    }
}
