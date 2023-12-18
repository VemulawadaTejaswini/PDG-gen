import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int X = scan.nextInt();
        int Y = scan.nextInt();

        int ans =Integer.MAX_VALUE;
        for(int i=0;i<=Math.max(2*X,2*Y);++i){
            ans = Math.min(ans, i*C + Math.max(0,X-i/2)*A + Math.max(0,Y-i/2)*B);
        }
        System.out.println(ans);


    }
}