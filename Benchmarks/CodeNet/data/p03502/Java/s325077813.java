import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        String ｓ=String.valueOf(N);
        char []ss=s.toCharArray;
        String[] sss=new String(ss);
        int sum=0;
        for(int i=0;i<ss.length;i++){
            int a=Integer.parseInt(sss[i]);
            sum+=a;}
        if(N%sum==0){
            System.out.println("Yes");
        }else{System.out.println("No");}
    }
}