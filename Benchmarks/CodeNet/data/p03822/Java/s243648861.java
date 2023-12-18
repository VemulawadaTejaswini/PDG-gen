import java.io.*;

public class Main {
    
    static int n;
    static int[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        a=new int[n];
        long count=0;
        for(int i=0;i<n-1;i++){ a[i]=Integer.parseInt(br.readLine()); }
        for(int i=0;i<n-1;i++){
            if(a[i]==1){ count=Math.max(count,dfs(i+2)); }
        }System.out.println(count+1);
    }
    
    static long dfs(int target){
        long count=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==target){
                count+=dfs(i+2)+1;
            }
        }return count;
    }
}