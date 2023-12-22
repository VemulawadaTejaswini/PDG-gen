import java.io.*;

class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int[] data = makeIntArray(br);
        int r = data[0], c = data[1];
        int[][] exl = new int[r + 1][c + 1];
        int i, j;
        for(i = 0; i < r; i++){
            data = makeIntArray(br);
            exl[i][c] = 0;
            for(j = 0; j < c; j++){
                exl[i][j] = data[j];
                exl[i][c] += data[j];
            }
        }
        for(j = 0; j <= c; j++){
            exl[r][j] = 0;
            for(i = 0; i < r; i++){ exl[r][j] += exl[i][j]; }
        }
        for(i = 0; i <= r; i++){ show(exl[i]); }
    }
    public static void show(int[] a){
        int n = a.length;
        for(int i = 0; i < n - 1; i++){ System.out.print(a[i] + " "); }
        System.out.println(a[n - 1]);
    }
    public static int[] makeIntArray(BufferedReader br) throws IOException
    {
        String[] str = br.readLine().split(" ");
        int n = str.length;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){ a[i] = Integer.parseInt(str[i]); }
        return a;
    }
}
