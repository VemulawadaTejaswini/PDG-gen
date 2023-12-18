import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();//入力される数
        int[] inx = new int[N];
        int[] iny = new int[N];
        int[] inh = new int[N];
        int H = 0;
        int Cx = 0;
        int Cy = 0;
        int w;
        int temp = 0;
        int flag;
        int memo = 0;

        for(int i = 0;i<N;i++){
            inx[i] = scan.nextInt();
            iny[i] = scan.nextInt();
            inh[i] = scan.nextInt();
            if(inh[i] != 0){memo = i;}
        }

        for(int k = 0;k<=100;k++){
            for(int r = 0;r <= 100;r++){
                flag = 1;
                temp = getH(inx[memo],iny[memo],k,r,inh[memo]);

                for(int s = 0;s < N;s++) {
                    w = getH(inx[s], iny[s], k, r, inh[s]);
                    if (temp != w) {
                        if(inh[s] == 0 && temp <= w){
                            continue;
                        }
                        flag = -1;
                        break;
                    }
                }
                if(flag == 1) {
                    Cx = k;
                    Cy = r;
                    H = temp;
                }
            }

        }

        System.out.println(Cx + " " + Cy + " " +H);

    }

    public static int getH(int x,int y,int Cx,int Cy,int h){
        int t = x - Cx > 0 ? x - Cx:Cx - x;
        int u = y - Cy > 0 ? y - Cy:Cy - y;
        int H = h + t + u;
        if(h >= 0){
            return H;
        }else{
            return 0;
        }
    }
}
