import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String[] args) throws Exception {
        int num;
        int[] x = new int[10001];
        int a = 1;
        int i = 0;
        int c = 0;
        int d =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        for (i=0;a!=0;i++) {
            x[i] = Integer.parseInt(br.readLine());
            a = x[i];
        }
        i--;
        while(i!=0){
            c++;
            System.out.println("Case "+c+": "+x[d]);
            d++;
            i--;
        }
    }
}
