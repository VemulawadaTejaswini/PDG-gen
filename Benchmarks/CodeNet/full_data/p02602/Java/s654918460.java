import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] score = new int[n];
        int sum = 1;
        int preSum =1;

        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<k;i++){
            sum= sum * score[i];
        }
        for(int i = k; i<n; i++){
            preSum = sum;
            sum = 1;
            for(int j=i-k+1; j<i+1; j++){
                sum = sum * score[j];
            }
            if(sum>preSum){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}