import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        String s2=s;
        s=s.replace("01","0a1");
        s=s.replace("10","1a0");
        String ss[]=s.split("a",0);
        int po[];
        if(s.split("",0)[0].equals("0")){
            po=new int[(ss.length+1)/2*2+2];
            po[0]=0;
            po[1]=0;
            for(int i=0;i<ss.length;i++){
                po[i+2]=po[i+1]+ss[i].length();
            }
        }
        else{
            po=new int [(ss.length)/2*2+2];
            po=new int[ss.length+1];
            po[0]=0;
            for(int i=0;i<ss.length;i++){
                po[i+1]=ss[i].length()+po[i];
            }
            po[po.length-1]=(po[po.length-1]==0)?po[po.length-2]:po[po.length-1];
        }
        int ans=0;
        if(k*3>=po.length)System.out.println(s2.length());
        else{
        for(int i=0;i<po.length-k*2+1;i+=2){
            ans=Math.max(ans,po[i+k*2-1]-po[i]);
        }
        for(int i=0;i<po.length-k*2;i+=2){
            ans=Math.max(ans,po[i+k*2]-po[i]);
        }
            System.out.println(ans);
        }
    }
}

