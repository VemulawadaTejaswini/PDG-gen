import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String po[]=new String[n];
        int a=0,b=0;
        int ans=0;
        for(int i=0;i<n;i++){po[i]=sc.next();
        int leng=po[i].length();
        po[i]=po[i].replace("AB","");
        ans+=(leng-po[i].length())/2;
        leng=po[i].length();
            if(po[i].substring(0,1).equals("B"))b++;
            if(po[i].substring(leng-1,leng).equals("A"))a++;
            
        }
        
        System.out.println(ans+Math.min(a,b));
    }
}
