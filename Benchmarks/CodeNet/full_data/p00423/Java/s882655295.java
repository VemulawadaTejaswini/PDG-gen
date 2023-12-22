import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] kekka = new String[2];
            String[] a_kekka = new String[5];
            String[] b_kekka = new String[5];
            int k = 0;

            while(true){
            int n = Integer.parseInt(bf.readLine());

                if(n == 0){
                    break;
                }
                kekka = Shobu(n);

                a_kekka[k] = kekka[0];
                b_kekka[k] = kekka[1]; 

                k += 1;
            }

            int[] a_saigo = new int[5];
            int[] b_saigo = new int[5];

            for(int i = 0; i < k; i++){
                  a_saigo[i] = Integer.parseInt(a_kekka[i]);
                  b_saigo[i] = Integer.parseInt(b_kekka[i]);
            }
            System.out.println();

            for(int i = 0; i < k; i++){
                System.out.println(a_saigo[i] + " " + b_saigo[i]);
            }
        
    

        }catch(IOException e){
            System.out.println(e);
        }
    }

    private static String[] Shobu(int n){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try{
            int[] a = new int[n];
            int[] b = new int[n];
            String[] gougou = new String[2];

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

            gougou[0] = String.valueOf(a_gou);
            gougou[1] = String.valueOf(b_gou);

            return gougou;

            
        }catch(IOException e){
            String[] c = new String[1];
            return c;
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