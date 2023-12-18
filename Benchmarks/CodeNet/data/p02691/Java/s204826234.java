import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve(){
        int n = in.nextInt();
        int []nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = in.nextInt();

        int count = 0;
        for(int i = 0 ; i < nums.length - 1; i++){
            for(int j = i + 1; j <nums.length; j++){
                if(Math.abs(j - i) == (nums[j]) + nums[i])
                    count++;
            }
        }
        System.out.println(count);
    }

}
