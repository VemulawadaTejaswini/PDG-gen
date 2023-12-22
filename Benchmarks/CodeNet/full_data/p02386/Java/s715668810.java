import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        Random random = new Random();
        int j,i,res,a;
        str = scan.nextLine();
        a = Integer.valueOf(str);
        int[][] x = new int[a][6];
        for(i = 0; i < a; i++) {
            str = scan.nextLine();
            String[] num = str.split(" ", 0);
            for (j = 0; j < 6; j++) {
                x[i][j] = Integer.valueOf(num[j]);
            }
        }
        res = 0;
        for(i=0;i<10000;i++){
            int r1,r2;
            r1 = r2 = 0;
            while(r1==r2){
                r1 = random.nextInt(a);
                r2 = random.nextInt(a);
            }
            res = check(x[r1],x[r2]);
            if(res == 1){
                break;
            }
        }


        if(res == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scan.close();
    }

    static void set(int[] x,int a,int b,int c,int d,int e,int f){
        x[0] = a;
        x[1] = b;
        x[2] = c;
        x[3] = d;
        x[4] = e;
        x[5] = f;
    }
    static void turn(int[] x,int i){
        switch (i){
            case 0:
                set(x,x[4],x[0],x[2],x[3],x[5],x[1]);
                break;
            case 1:
                set(x,x[3],x[1],x[0],x[5],x[4],x[2]);
                break;
            case 2:
                set(x,x[2],x[1],x[5],x[0],x[4],x[3]);
                break;
            case 3:
                set(x,x[1],x[5],x[2],x[3],x[0],x[4]);
                break;
        }
    }
    static int check(int[] x, int[] y){
        Random random = new Random();
        int i,res;
        res = 0;
        for(i = 0; i < 1000; i++){
            if(x[0]==y[0]&&x[1]==y[1]&&x[2]==y[2]&&x[3]==y[3]&&x[4]==y[4]&&x[5]==y[5]){
                res = 1;
                break;
            }
            turn(x,random.nextInt(4));
        }
        return res;
    }
}

