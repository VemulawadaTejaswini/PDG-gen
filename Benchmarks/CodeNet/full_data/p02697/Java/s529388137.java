import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String[] ss=br.readLine().split(" ");
            int n=Integer.parseInt(ss[0]);
            int m=Integer.parseInt(ss[1]);
            if(n%2==0){
                n--;
            }
            int l=1,r=n;
            while(l<r){
                if(m==0){
                    return;
                }
                System.out.println(l+" "+r);
                l++;
                r--;
                m--;
            }



        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }
    static int mod(int a,int b){
        if (a>b){
            return a-b;
        }
        return b-a;
    }
    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
