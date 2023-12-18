import java.util.Scanner;

public class Main {
    static int H;
    static int W;
    static Boolean [][] A;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        H = Integer.parseInt(scan.next());
        W = Integer.parseInt(scan.next());
        A = new Boolean[H][W];
        for(int h=0;h<H;h++){
            String as = scan.next();
            for(int w=0;w<W;w++){
                char a = as.charAt(w);
                if(a=='#'){
                    A[h][w] = true;
                }else{
                    A[h][w] = false;
                }

            }
        }
        scan.close();
        if(calc(0,0)){
            for(int h=0;h<H;h++){
                for(int w=0;w<W;w++){
                    if(A[h][w]){
                        System.out.print("Impossible");
                        System.exit(0);
                    }
                }
            }
            System.out.print("Possible");
        }else{
            System.out.print("Impossible");
        }
    }

    public static Boolean calc(int h,int w){

        if(h==H-1 && w==W-1){
            A[h][w] = false;
            return true;
        }
        if(A[h][w]){
            A[h][w] = false;
            if(h<H-1) {
                if (calc(h + 1, w)) return true;
            }
            if(w<W-1) {
                if (calc(h, w + 1)) return true;
            }
        }else{
            return false;
        }
        return false;
    }

}