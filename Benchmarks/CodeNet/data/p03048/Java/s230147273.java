import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int ans = 0;

        for(int i = 0;i <= 3000;i++){
            for(int j = 0;j <= 3000;j++){
                int v = i * r + j * g;
                if(n >= v && (n - v) % b == 0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}