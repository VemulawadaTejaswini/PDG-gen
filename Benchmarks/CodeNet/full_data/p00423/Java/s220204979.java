import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true){
            int n = Integer.parseInt(bf.readLine());

                if(n == 0){
                    break;
                }
                
                Shobu(n);
            }


        }catch(IOException e){
            System.out.println(e);
        }
    }

    private static void Shobu(int n){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try{
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                String line = bf.readLine();
                String[] strAry = line.split(" ");
                a[i] = Integer.parseInt(strAry[0]);
                b[i] = Integer.parseInt(strAry[1]);
            }

            int a_gou = 0;
            int b_gou = 0;

            for(int i = 0; i < n; i++){
                if(a[i] > b[i]){
                    a_gou += Katimake(a[i], b[i]);
                }else if(a[i] < b[i]){
                    b_gou += Katimake(a[i], b[i]);
                }else{
                    a_gou += Katimake(a[i], b[i]);
                    b_gou += Katimake(a[i], b[i]);
                }
            }

            System.out.println(a_gou + " " + b_gou);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static int Katimake(int x, int y){
        if(x == y){
            return x;
        }else{
            return (x + y);
        }
    }
}