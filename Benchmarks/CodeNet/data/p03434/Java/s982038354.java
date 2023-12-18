import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int alice = 0;
        int bob = 0;
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        for(int i = N-1;i >= 0;i -= 2){
            alice += a[i];
        }

        for(int i = N-2;i >= 0;i -= 2){
            bob += a[i];
        }
        System.out.println(alice - bob);
    }
}