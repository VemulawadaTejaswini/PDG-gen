import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //左右の閉じ括弧不足分(0:左、1:右、2:左－右)
        int[][] part = new int[N][3];
        //左右の閉じ括弧不足分が0の個数(0:左、1:右、2:両方)
        int[] zeroNum = new int[3];
        for(int i = 0 ; i < N ; i++){
            String str = sc.next();
            int leftPart = 0;
            int rightCount = 0;
            for(int j = 0 ; j < str.length() ; j++){
                boolean isopen = str.charAt(j) == ')';
                if(isopen){
                    if(rightCount > 0){
                        rightCount--;
                    }else{
                        leftPart++;
                    }
                }else{
                    rightCount++;
                }
            }
            part[i][0] = leftPart;
            int rightPart = 0;
            int leftCount = 0;
            for(int j = str.length()-1 ; j >= 0 ; j--){
                boolean isopen = str.charAt(j) == '(';
                if(isopen){
                    if(leftCount > 0){
                        leftCount--;
                    }else{
                        rightPart++;
                    }
                }else{
                    leftCount++;
                }
            }
            part[i][1] = rightPart;
            part[i][2] = part[i][0]-part[i][1];

            if(part[i][0] == 0){
                if(part[i][1] == 0){
                    zeroNum[2]++;
                }else{
                    zeroNum[0]++;
                }
            }else if(part[i][1] == 0){
                zeroNum[1]++;
            }
        }

        int diff = 0;
        for(int i = 0 ; i < N ; i++){
            diff += part[i][2];
        }
        if(diff != 0){
            System.out.println("No");
        }else{
            if(zeroNum[0] > 0 && zeroNum[1] > 0){
                System.out.println("No");
            }else{
                System.out.println("No");
            }
        }
    }
}
