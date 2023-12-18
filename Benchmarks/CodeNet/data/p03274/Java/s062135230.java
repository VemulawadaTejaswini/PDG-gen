import java.util.Scanner;

public class Main {

    static int result = 0;
    static int totalStep = 0;
    static int k = 0;
    static int d = 0;
    static  int n = 0;
    public static void main(String[] args){
      //System.setIn(new FileInputStream("D:/samleInput.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int []input = new int[n];
        int leftFlag = 0;
        int rightFlag = 0;
        int zeroFlag = 0;
        int leftFirst = -1;
        int rightFirst = -1;
        for (int i = 0; i < n; i++) {
            int location = sc.nextInt();
            input[i] = location;
            if (location>0){
                rightFlag = 1;
                if(rightFirst == -1){
                    rightFirst = i;
                }

            }else if(location == 0){
                zeroFlag = 1;
            }else {
                leftFlag = 1;
                leftFirst = i;

            }
        }
        if(rightFlag == 1 &&leftFlag == 0 ){
            result += Math.abs(input[k-1]);
        }else if(rightFlag == 0 &&leftFlag == 1 ){
            result = Math.abs(input[n-k]);
        }else if (rightFlag == 1 &&leftFlag == 1 ){
            int  leftResult =Math.abs(input[rightFirst])*2;
            if(zeroFlag == 1){
                leftResult += Math.abs(input[leftFirst-(k-3)]);
            }else {
                leftResult += Math.abs(input[leftFirst-(k-2)]);
            }

            int  rightResult =Math.abs(input[leftFirst])*2;
            if(zeroFlag == 1){
                rightResult += Math.abs(input[rightFirst+k-3]);
            }else {
                rightResult += Math.abs(input[rightFirst+k-2]);

            }

            if(rightResult-leftResult<0){
                result = rightResult;
            }else {
                result = leftResult;
            }

        }
        System.out.println(result);
        }
}