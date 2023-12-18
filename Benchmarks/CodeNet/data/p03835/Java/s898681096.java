import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int sumAns = sc.nextInt();
        int result = countSumOfThree(max, sumAns);
        System.out.println(result);
        sc.close();
    }
    public static int countSumOfThree(int max, int sumAns){
        int count = 0;
        for(int i=0; i<=max; i++){
            for(int j=0; j<=max; j++){
                for(int k=0; k<=max; k++){
                    if(i+j+k == sumAns) count++;
                }
            }
        }
        return count;
    }
}