import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i=0; i<n; i++){
            l[i] = sc.nextInt();
        }
        int argmax = 0;
        int max = l[0];
        for(int i=1; i<n; i++){
            if(l[i] > max){
                argmax = i;
                max = l[i];
            }
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += l[i];
        }
        if(max < sum - max){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}