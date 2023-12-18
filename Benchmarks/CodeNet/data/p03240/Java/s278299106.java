import java.util.*;

class Main {
    public static void main(String[]$){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]x=new int[n],y=new int[n],h=new int[n];
        for(int i=0;i<n;++i){
            x[i]=s.nextInt();
            y[i]=s.nextInt();
            h[i]=s.nextInt();
        }
        
        for(int i=0;i<=100;++i){
            loop:
            for(int j=0;j<=100;++j){
                int k=h[0]+Math.abs(j-x[0])+Math.abs(i-y[0]);
                
                for(int l=1;l<n;++l){
                    if(k!=h[l]+Math.abs(j-x[l])+Math.abs(i-y[l]))
                        continue loop;
                }
                
                System.out.println(j+" "+i+" "+k);
                return;
            }
        }
    }
}
