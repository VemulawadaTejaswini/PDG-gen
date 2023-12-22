
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0].trim());
        int k=Integer.parseInt(s[1].trim());
        String[] s2=br.readLine().split(" ");
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=Long.parseLong(s2[i].trim());
        }


//        int n=Integer.parseInt(br.readLine().trim());
algo(a,k);
    }

    public static void algo(long[] a,int k){
        long mul=1;
        for(int i=0;i<k;i++){
            mul=mul*a[i];
        }
        StringBuffer sb=new StringBuffer();
        for(int i=k;i<a.length;i++){
            long r=(mul)/a[i-k];
            r=r*a[i];
            if(r>mul){
                sb.append("YES\n");
            }
            else{
                sb.append("No\n");
            }
            mul=r;
        }
        System.out.print(sb.toString());

    }



}
