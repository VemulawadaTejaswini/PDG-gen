import java.util.Scanner;
class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for(int i=0;i<N;i++)a[i] = sc.nextInt();
        int max=a[0];
        int ans =0;
        for(int i=1;i<N;i++){
            if(max>a[i]){
                ans += max - a[i];
            }else{
                max = a[i];
            }
        }
        System.out.println(ans);
    }
}