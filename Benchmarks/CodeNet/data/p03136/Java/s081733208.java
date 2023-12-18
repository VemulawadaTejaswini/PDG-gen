import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        int sum = 0;
        for(int i = 0;i < N;i++){
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        for(int sum:n){
            sum += n;
        }
        System.out.println(n[N] < sum-n[N]?"Yes":"No");
        }
    }
