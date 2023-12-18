import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int[][] input = new int[rows][3];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 3; j++) {
                int happiness = sc.nextInt();
                input[i][j] = happiness;
            }
        }
        System.out.println(findMaxGain(input));

    }

    public static int findMaxGain(int[][] happinessArr){

        int[] dp = new int[3];

        for (int i = 0; i < 3; i++) {
            dp[i] = happinessArr[0][i];
        }

        int rows = happinessArr.length;
        for (int row = 1; row < rows; row++) {
            MaxAndSecondMax maxAndSecondMax = findMaxAndSecMax(dp);
            for (int col = 0; col < 3; col++) {
                dp[col] = happinessArr[row][col] + findMaxHappTillPrevDay(maxAndSecondMax, col);
            }
        }

        MaxAndSecondMax maxAndSecMax = findMaxAndSecMax(dp);
        return maxAndSecMax.getMax();
    }


    private static MaxAndSecondMax findMaxAndSecMax(int[] arr){
        MaxAndSecondMax obj = new MaxAndSecondMax();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if(obj.getMax() < arr[i]){
                obj.setSecndMax(obj.getMax());
                obj.setSecndMaxIndex(obj.getMaxIndex());
                obj.setMax(arr[i]);
                obj.setMaxIndex(i);
            }

            if(arr[i] > obj.getSecndMax() && arr[i] < obj.getMax()){
                obj.setSecndMax(arr[i]);
                obj.setSecndMaxIndex(i);
            }
        }

        return obj;
    }

    private static int findMaxHappTillPrevDay(MaxAndSecondMax maxAndSecondMax, int col){
        if(col != maxAndSecondMax.getMaxIndex()){
            return maxAndSecondMax.getMax();
        } else {
            return maxAndSecondMax.getSecndMax();
        }
    }
}

class MaxAndSecondMax {
    int max = -1;
    int maxIndex = -1;
    int secndMax = -2;
    int secndMaxIndex = -1;

    public int getMax() {
        return max;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public int getSecndMax() {
        return secndMax;
    }

    public int getSecndMaxIndex() {
        return secndMaxIndex;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    public void setSecndMax(int secndMax) {
        this.secndMax = secndMax;
    }

    public void setSecndMaxIndex(int secndMaxIndex) {
        this.secndMaxIndex = secndMaxIndex;
    }
}
