import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        Set<String> hasOkashi = new HashSet<>();
        for(int i = 0 ; i<k; i++){
            int d = Integer.parseInt(sc.nextLine());
            String[] arr = sc.nextLine().split(" ");
            for(int j = 0; j<d;j++){
                hasOkashi.add(arr[j]);
            }
        }
        int sum = n - hasOkashi.size();
        System.out.println(sum);

    }
}