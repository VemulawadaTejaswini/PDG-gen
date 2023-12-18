import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int k = sc.nextInt();
        sc.nextLine();
        int[] x = new int[n];
        int answer = 0;
        for(int i = 0;i<n;i++){
            x[i] = sc.nextInt();
            if(x[i] <Math.abs(k-x[i])){
                answer += x[i]*2;
            }else{
                answer += Math.abs(k-x[i])*2;
            }
        }
        System.out.println(answer);

    }
}