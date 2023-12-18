import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        boolean[] aw=new boolean[n];
        int[] ary=new int[n];
        int ac_c=0,wa_c=0;
        Arrays.fill(aw,false);
        Arrays.fill(ary,0);
        for(int i=0;i<m;i++){
            int p=sc.nextInt();
            String s=sc.next();
            if(s.equals("AC")){
                if(!aw[p-1]){
                    ac_c++;
                }
                aw[p-1]=true;
            }
            if(s.equals("WA")&&!aw[p-1]){
                ary[p-1]++;
            }
        }
        for(int i=0;i<n;i++){
            if(aw[i]){
                wa_c+=ary[i];
            }
        }
        System.out.println(ac_c +" "+ wa_c);
    }
}