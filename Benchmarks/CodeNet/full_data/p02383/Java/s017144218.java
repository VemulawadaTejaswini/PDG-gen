import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int j,i,h;
        int[] x = new int[6];
        /*
        int[][] a = {
                {0,0,0,0},
                {5,2,3,4},
                {1,6,3,4},
                {5,2,6,1},
                {5,2,1,6},
                {6,1,3,4},
                {2,5,3,4}};
        */
        str = scan.nextLine();
        String[] num = str.split(" ", 0);
        for(i = 0; i < 6; i++){
            x[i] = Integer.valueOf(num[i]);
        }
        h = 1;
        str = scan.nextLine();
        for(i=0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'S':
                    set(x,x[4],x[0],x[2],x[3],x[5],x[1]);
                    break;
                case 'E':
                    set(x,x[3],x[1],x[0],x[5],x[4],x[2]);
                    break;
                case 'W':
                    set(x,x[2],x[1],x[5],x[0],x[4],x[3]);
                    break;
                case 'N':
                    set(x,x[1],x[5],x[2],x[3],x[0],x[4]);
                    break;
            }
            //System.out.println(x[h]);
        }
        System.out.println(x[0]);

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
}


