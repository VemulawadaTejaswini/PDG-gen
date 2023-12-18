import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[]c=sc.next().toCharArray();
        int ans=1;
        boolean flag=false;
        String s=c[0]+"";
        for(int i=1;i<c.length;i++){
            if(s.length()==1){
                String po=c[i]+"";
                if(s.equals(po)){
                    if(i==c.length-1){
                        ans--;
                    }
                    else{
                    i++;
                    po+=c[i];
                        
                    }
                }
                s=po;
            }
            else{
                s=c[i]+"";
            }
            ans++;
        }
        System.out.println(ans);
    }
}
