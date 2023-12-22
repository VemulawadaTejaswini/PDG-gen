import java.io.*;

class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int[] m = makeIntArray(br);
        int N = m[0];
        int[] data = makeIntArray(br);
        rev(data);
        show(data);

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
    public static void rev(int[] a){
        int n = a.length;
        int x;
        for(int i = 0; i < (n / 2); i++){
            x = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = x;
        }
    }
}
