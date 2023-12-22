import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long ans = 0;
        for(long i=1;i<N;i++){
            for(long j=1;j<N;j++){
                if(i*j>=N) break;
                else{
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
