import java.util.Scanner;
class Main{
    int H,W,i,r;
    boolean x = true;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        if(H == 0 && W == 0){
            x = false;
        }
        while(x == true){
            for(i = 0; i < H; i++){
                for(r = 0; r < W; r++){
                    if(i == 0 || i == H-1 || r == 0 || r == W-1){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
            H = sc.nextInt();
            W = sc.nextInt();
            if(H == 0 && W == 0){
                x = false;
            }
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}