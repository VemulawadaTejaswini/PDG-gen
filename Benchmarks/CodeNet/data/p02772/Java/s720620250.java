import java.util.Scanner;

public class Atcoder{

public static void main(String[] args) {
    System.out.println("入力する数");
    Scanner sca01 = new Scanner(System.in);
    int num = sca01.nextInt();
    System.out.println("いくつかの整数を入力");
    Scanner sca02 = new Scanner(System.in);
    int nums[] = new int[num];
    int aaa=0;
        for(int j=0; j<nums.length; j++){
            nums[j] = sca02.nextInt();
            if(nums[j]%2==0 && nums[j]%3==0){
                aaa=1;
            }else if(nums[j]%2==0 && nums[j]%5==0){
                aaa=aaa+1;
            }
        }
        if(aaa>1){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }

    }
}
