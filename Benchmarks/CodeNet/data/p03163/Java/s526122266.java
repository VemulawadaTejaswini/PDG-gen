import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    public static long max=0;
    public static void rec(long total,long[][]arr,int pos){
        rec(total,arr,pos,0);
    }
    public static void rec(long total,long[][]arr,int pos,long val){
        if(pos<0&&total>0){
            max=Long.max(max,val);
        }
        else if(total > 0){
            max=Long.max(max,val);
                rec(total - arr[pos][0], arr, pos - 1, val + arr[pos][1]);
                rec(total, arr, pos - 1, val);
        }
        else if(total==0){
            max=Long.max(max,val);
        }
    }
    public static void main(String[] args)throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        long [][] arr = new long[number][2];
        long weight= Long.parseLong(st.nextToken());
        for(int i = 0;i <number;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Long.parseLong(st.nextToken());
            arr[i][1]=Long.parseLong(st.nextToken());
        }
        rec(weight,arr,number-1);
        out.println(max);
        out.flush();
    }
}