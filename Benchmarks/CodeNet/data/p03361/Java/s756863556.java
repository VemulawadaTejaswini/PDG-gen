import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, W;
        H = sc.nextInt();
        W = sc.nextInt();
        char[][] list = new char[H][W];
        String [] list2 = new String[H];
        for(int a=0;a<H;a++){
            list2[a] = sc.next();
        }
        for (int a = 0; a < H; a++) {
            for (int b = 0; b < W; b++) {
                list[a][b] = list2[a].charAt(b);
            }
        }
        int num2=0;
        for(int a=1;a<H-1;a++){
            for(int b=1;b<W-1;b++){
                int num=0;
                if(list[a][b]=='#'){
                    if(list[a-1][b]=='#') num++;
                    if(list[a+1][b]=='#') num++;
                    if(list[a][b-1]=='#') num++;
                    if(list[a][b+1]=='#') num++;
                }
                else num=1;
                if(num==0){
                    num2=1;
                    break;
                }
            }
            if(num2==1)break;
        }
        if(num2==1) System.out.println("No");
        else System.out.println("Yes");
    }
}
