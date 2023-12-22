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
            int[][] arr=new int[m][2];
            int c=2;
            for(int i=0;i<m;i++){
                arr[i][0]=c;
                c++;
            }
            for(int i=m-1;i>=0;i--){
                arr[i][1]=c;
                c++;
            }
            for(int i=0;i<m;i++){
                System.out.println(arr[i][0]+" "+arr[i][1]);
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
