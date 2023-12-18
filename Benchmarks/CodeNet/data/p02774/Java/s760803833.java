import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> nums = new ArrayList<>();
        List<Long> results = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            int num = scanner.nextInt();
            nums.add(num);
            if(i > 0){
                for(int j = i - 1 ; j >= 0 ; j--) {
                    long result = ((long) nums.get(i)) * nums.get(j);
                    if(results.size() > k && results.get(k -1) < result){
                        continue;
                    }
                    results.add(((long) nums.get(i)) * nums.get(j));
                    Collections.sort(results);
                }
            }
        }

        System.out.println(results.get(k - 1));
    }
}