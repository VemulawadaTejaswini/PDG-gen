import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new TEST().doIt();
    }
    class TEST{
    	int data[];
        int n,m;
        void min_update(int i,int x){
            i += n - 1;
            data[i] = x;
            while(i > 0){
                i = (i - 1)/2;
                data[i] = Math.min(data[i*2+1],data[i*2+2]);
            }
        }
        void sum_update(int i,int x){
            i += n - 1;
            data[i] += x;
            while(i > 0){
                i = (i - 1)/2;
                data[i] += x;
            }
        }
        int query(int a,int b,int k,int l,int r){
            if(r <= a || b <= l)return 0;
            if(a <= l && r <= b)return data[k];
            else{
                int vl = query(a,b,k*2+1,l,(l+r)/2);
                int vr = query(a,b,k*2+2,(l+r)/2,r);
                return vl + vr;
            }
        }
        void doIt(){
            int num = sc.nextInt();
            m = sc.nextInt();
            n = 1;
            while(n < num)n <<= 1;
//          System.out.println(n);
            data = new int [n*2];
            //????°???????
//            Arrays.fill(data,Integer.MAX_VALUE);
            for(int i = 0;i < m;i++){
                int com = sc.nextInt();
                int x = sc.nextInt()-1;
                int y = sc.nextInt();
                if(com == 0)sum_update(x,y);
                else System.out.println(query(x,y,0,0,n));
                for(int j = 0;j < n*2 - 1;j++){
                	System.out.print(data[j]+" ");
                }
                System.out.println();
            }
    	}
    }
}