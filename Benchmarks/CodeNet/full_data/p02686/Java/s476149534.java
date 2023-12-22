import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static StreamTokenizer in;
    static {
        try{
            in = new StreamTokenizer(new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in))));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int nextInt() throws IOException{ in.nextToken(); return (int)in.nval; }
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int n=sc.nextInt();
        String m[]=new String[n];
        boolean b[]=new boolean[n];//t放后
        long left[]=new long[n];
        long right[]=new long[n];
        for(int i=0;i<n;i++) {
            m[i] = sc.next();
            int p=m[i].indexOf("(");
            int q=m[i].indexOf(")");
            while(p<q&&p!=-1&&q!=-1){
                m[i]=m[i].substring(0,p)+m[i].substring(p+1,q)+m[i].substring(q+1);
                p=m[i].indexOf("(");
                q=m[i].indexOf(")");
            }
            //System.out.println(m[i]);
            char e[]=m[i].toCharArray();
            for(int j=0;j<m[i].length();j++){
                if(e[j]=='(')
                    left[i]++;
                else right[i]++;
            }
        }
        int flag=0;
        long all=0;
        for(int i=0;i<n;i++){
            //System.out.println(left[i]+" "+right[i]);
            if(left[i]>0&&right[i]==0)
                all+=left[i];
        }
        for(int i=0;i<n;i++){
            if(right[i]>0){
                //System.out.println("a");
                all-=right[i];
                if(all<0)
                    flag++;
                all+=left[i];
            }

        }
        //System.out.println(all);
        if(flag!=0||all!=0)
            System.out.print("No");
        else System.out.print("Yes");
    }
}
