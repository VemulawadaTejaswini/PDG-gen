import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        ArrayList<Integer> arip = new ArrayList<Integer>();
        ArrayList<Integer> ariq = new ArrayList<Integer>();
        for(int i = 0;i<n;i++){
            p[i] = sc.nextInt();
            arip.add(i+1);
        }for(int i = 0;i<n;i++){
            q[i] = sc.nextInt();
            ariq.add(i+1);
        }
        int pkari = 0;
        int qkari = 0;
        for(int i = n-1;i>0;i--){
            int kurai = 0;
            if(i==7){kurai=5040;}
            else if(i==6){kurai=720;}
            else if(i==5){kurai=120;}
            else if(i==4){kurai=24;}
            else if(i==3){kurai=6;}
            else if(i==2){kurai=2;}
            else{kurai=1;}
            int pi = arip.indexOf(p[(n-1)-i]);
            int qi = ariq.indexOf(q[(n-1)-i]);
            pkari += (1 + pi) * kurai;
            qkari += (1 + qi) * kurai;
            arip.remove(pi);ariq.remove(qi);
        }
        int re = Math.abs((pkari-qkari));
        System.out.println(re);
        sc.close();
    }
}