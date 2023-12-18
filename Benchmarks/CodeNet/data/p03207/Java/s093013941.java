import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] ary=new int[num];
        for(int i=0;i<num;i++)ary[i]=sc.nextInt();
        int maxnum=ary[0];
        int gt=maxnum/2;
        for(int i=1;i<num;i++){
            if(maxnum<=ary[i]){
                gt+=maxnum/2;
                maxnum=ary[i];
                gt+=maxnum/2;
            }else{
                gt+=ary[i];
            }
        }
        System.out.println(gt+"\n");
    }
}