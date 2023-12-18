import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanNumber = new Scanner(System.in);

        int num = scanNumber.nextInt();

        int[] nums = new int[num];

        for(int i = 0; i < num ; i++){
            nums[i] = scanNumber.nextInt();
        }

        scanNumber.close();

        int answer = 100000;

        int calced = 0;
        int newcalced = 0;

        while(true){
            newcalced = calc(answer,nums);
            if(answer == 0){
                break;
            }
            if(calced < newcalced){
                calced = newcalced;
            }
            answer = answer - 1;
        }


        System.out.print(calced);

    }

    public static int calc(int answer, int[] nums){

        int retNum = 0;

        for(int i=0; i < nums.length ; i++){
            retNum = retNum + answer%nums[i];
        }

        return retNum;
    }
}
