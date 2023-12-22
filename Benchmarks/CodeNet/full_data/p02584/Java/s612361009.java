import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();
        sc.close();
        long closest = x;
        long absX = Math.abs(x);

        for(long i = 0; i < k; i++){
            if(x >= 0){
                x -= d;
            }
            else{
                x += d;
            }
            absX = Math.abs(x);
            if(closest < absX){
                if((k - i - 1) % 2 == 0){
                    System.out.println(absX);
                    return;
                }
                else{
                    System.out.println(closest);
                    return;
                }
            }
            if(closest > absX){
                closest = absX;
            }
        }
        System.out.println(absX);
    }
}