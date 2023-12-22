import java.io.*;

public class Main{

    static boolean exhaustiveSearch(int[] a, int i, int key){
        if(key == 0)
            return true;
        if(i >= a.length)
            return false;
        boolean res = exhaustiveSearch(a, i + 1, key) || exhaustiveSearch(a, i + 1, key - a[i]);
        return res;
    }
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try{
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);

            int q = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] m = new int[q];
            for(int i = 0; i < q; i++)
                m[i] = Integer.parseInt(str[i]);

            for(int i = 0; i < q; i++){
                if(exhaustiveSearch(a, 0, m[i])){
                    sb.append("yes\n");
                }else{
                    sb.append("no\n");
                }
            }

            System.out.print(sb.toString());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
