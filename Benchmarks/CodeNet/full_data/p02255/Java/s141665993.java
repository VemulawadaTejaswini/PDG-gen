import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(line[i]);
        }
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]);
            if(i != n-1){
                System.out.print(" ");
            }
        }
        System.out.print("\n");

        for(int i = 1; i < n; i++){

            int key = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
            for(int x = 0; x < n; x++){
                System.out.print(nums[x]);
                if(x != n-1){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}