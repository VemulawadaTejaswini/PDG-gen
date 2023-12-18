import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int w=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        
        int lx=0;
        int rx=w;
        int dy=0;
        int uy=h;
        
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int a=Integer.parseInt(st.nextToken());
            
            if(a==1&&lx<x){
                lx=x;
            }else if(a==2&&x<rx){
                rx=x;
            }else if(a==3&&dy<y){
                dy=y;
            }else if(a==4&&y<uy){
                uy=y;
            }
        }
        int sum=(rx-lx)*(uy-dy);
        if(sum<=0){
            System.out.println(0);
        }
        else{
            System.out.println(sum);
        }
        
    }
}