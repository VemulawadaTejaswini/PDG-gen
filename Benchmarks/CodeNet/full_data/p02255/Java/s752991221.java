import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(bf.readLine());
        int[] h=new int[a];

        String[] str=bf.readLine().split(" ");
        for(int i=0;i<a;i++){
            h[i]=Integer.parseInt(str[i]);
        }
        str.clone();
        Sort(h,a);
    }


    public static void Sort(int[] a, int b){
        int j,v;

        for(int i=0; i<a.length; i++){
            v=a[i];
            j=i-1;

            while(j>=0 && a[j]>v){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=v;
            toArray(a);
        }

    }

    public static void toArray(int[] h){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<h.length;i++){
            sb.append(h[i]);

            if(i<h.length-1)sb.append(" ");
        }
        System.out.println(sb);
    }
}