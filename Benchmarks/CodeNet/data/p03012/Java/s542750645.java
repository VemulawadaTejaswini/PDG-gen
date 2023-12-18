import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int weightNum = sc.nextInt();

        int[] weights = new int[weightNum];
        int total = 0;
        for(int i = 0; i < weightNum; i++){
            weights[i] = sc.nextInt();
            total += weights[i];
        }

        int index = 0;
        int sum = 0;
        while(sum < total / 2){
            sum += weights[index];
            index++;
        }
        int ans = minDiff(index, weights, weightNum);
        ans = Math.min(ans,minDiff(index-1, weights, weightNum));
        System.out.println(ans);
    }

    public static int minDiff(int index, int[] weights, int weightNum){
        int ans = 0;
        for(int i = 0; i < index; i++){
            ans += weights[i];
        }
        for(int i = index; i < weightNum; i++){
            ans -= weights[i];
        }
        return Math.abs(ans);
    }

}
