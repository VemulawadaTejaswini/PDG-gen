

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static FastScanner fs=new FastScanner();
    public static void main(String[] args) {
        int n,m,k;
        n=fs.nextInt();
        m=fs.nextInt();
        k=fs.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=0;i<n;i++)
            A.add(fs.nextInt());
        for(int i=0;i<m;i++)
            B.add(fs.nextInt());

        int t=0,count=0;

        while((!A.isEmpty())&& (!B.isEmpty())){

            if(A.get(0)< B.get(0)){
                t+=A.get(0);
                A.remove(0);
            }else{
                t+=B.get(0);
                B.remove(0);
            }

            if(t<=k)
                count++;
            else {
                System.out.println(count);
                return;
            }

        }

        if(t<=k && A.isEmpty()){

            while(!(B.isEmpty())){
                t+=B.get(0);
                B.remove(0);
                if(t<=k)
                    count++;
                else {
                    System.out.println(count);
                   return;
                }
            }

        }else if (t<=k && B.isEmpty()){
            while(!(A.isEmpty())){
                t+=A.get(0);
                A.remove(0);
                if(t<=k)
                    count++;
                else {
                    System.out.println(count);
                    return;
                }
            }
        }

        System.out.println(count);


    }


   /**/ static void solve(){

    }

    /*static String rev(String s){
        String temp = "";
        for(int i=s.length()-1;i>=0;i--)
            temp+=s.charAt(i);
        int i=0;
        while(temp.charAt(i)=='0')
            i++;
        temp=temp.substring(i);
        return temp;

    }
*/
    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }


}
