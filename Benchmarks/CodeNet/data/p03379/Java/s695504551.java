import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] l1 = new int[N];
        int[] l2 = new int[N];
        for(int i = 0;i < N;i++){
            l1[i] = sc.nextInt();
            l2[i] = l1[i];
        }
        Arrays.sort(l2);
        int right = l2[N/2];
        int left = l2[N/2-1];
        if(right == left){
            for(int i = 0;i < N;i++)    System.out.println(right);
            return;
        }
        for(int i = 0;i < N;i++){
            if(l1[i] > left)    System.out.println(left);
            else if(l1[i] < right)  System.out.println(right);
        }
    }
}