import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split(" ");

        int w = Integer.parseInt(array[0]);
        int h = Integer.parseInt(array[1]);
        int x = Integer.parseInt(array[2]);
        int y = Integer.parseInt(array[3]);

        //Xを使う
        int X1 = x * h;
        int X2 = (w-x) * h;

        //Yを使う
        int Y1 = y * w;
        int Y2 = (h-y) * w;

        int Xmin;
        int Ymin;
        //Xを決める
        if(X1 <= X2){
            Xmin = X1;
        }else{
            Xmin = X2;
        }
        //Yを決める
        if(Y1 <= Y2){
            Ymin = Y1;
        }else{
            Ymin = Y2;
        }

        if(Xmin <= Ymin){
            System.out.print((double)Ymin + " ");
            System.out.println(1);
        }else{
            System.out.print((double)Xmin + " ");
            System.out.println(0);
        }
    }
}