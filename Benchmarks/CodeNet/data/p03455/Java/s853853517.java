import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int ans = Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]);
        if(ans%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}