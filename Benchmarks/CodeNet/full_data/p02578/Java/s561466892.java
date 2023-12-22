import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] height = new int[a];
        for(int i = 0; i < a; i++) {
            height[i] = sc.nextInt();
        }
        int[] maxSeenSoFar = new int[a+1];
        for(int i = 0; i < height.length; i++) {
            maxSeenSoFar[i+1] = Math.max(maxSeenSoFar[i], height[i]);
        }
        int maxStool = 0;
        for(int i = 0; i < height.length; i++) {
            maxStool += Math.max(0, maxSeenSoFar[i+1] - height[i]);
        }
        System.out.println(maxStool);
    }
}