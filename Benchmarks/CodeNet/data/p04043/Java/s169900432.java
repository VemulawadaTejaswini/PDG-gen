import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int nums[] = new int[n];
        for(int j = 0; j < nums.length ;j++){
            nums[j] = sc.nextInt();
        }
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i =0; i < nums.length; i++){
            if(nums[i]==5){
                cnt1 ++;
            }
            else if(nums[i]==7){
                cnt2 ++;
            }
            else{
                break;
            }
        }

        if(cnt1 ==2 && cnt2 ==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}