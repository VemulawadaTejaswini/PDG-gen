import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        char[][]po=new char[h][w];
        int[][][]a=new int[h][w][2];
        for(int i=0;i<h;i++){
            po[i]=sc.next().toCharArray();
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(j==0){
                    int count=0;
                    while(j+count<w&&po[i][j+count]=='.')count++;
                    a[i][j][0]=count;
                }
                else{
                    if(po[i][j]=='.')
                        if(po[i][j-1]=='.'){
                            a[i][j][0]=a[i][j-1][0];
                        }
                        else{
                            int count=0;
                            while(j+count<w&&po[i][j+count]=='.')count++;
                            a[i][j][0]=count;
                        }
                    else {
                        a[i][j][0]=0;
                    }
                }
            }
        }
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                if(j==0){
                    int count=0;
                    while(j+count<h&&po[j+count][i]=='.')count++;
                    a[j][i][1]=count;
                }
                else{
                    if(po[j][i]=='.')
                        if(po[j-1][i]=='.'){
                            a[j][i][1]=a[j-1][i][1];
                        }
                        else{
                            int count=0;
                            while(j+count<h&&po[j+count][i]=='.')count++;
                            a[j][i][1]=count;
                        }
                    else {
                        a[j][i][1]=0;
                    }
                }
            }
        }
        int ans=0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
               // System.out.print(a[i][j][0]+","+a[i][j][1]+" ");
            
                ans=Math.max(ans,a[i][j][0]+a[i][j][1]-1);
                
            }
            //System.out.println();
        }
        System.out.println(ans);
    }
}
