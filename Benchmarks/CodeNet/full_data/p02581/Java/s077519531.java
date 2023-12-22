import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * sp86
 */

class Tasd {
    public int x,y,num;

    
}

public class sp86 {
    
    static int[][]arr=new int[2001][2001];
    static int[]arr2=new int[2001];
    static int[]ar=new int[6001];
    static int cn;
    public static void main(String[] args) {
        for(int i=0;i<2001;i++)
            Arrays.fill(arr[i],-1);
        int ak,aj;
        ak=aj=0;
        Scanner sc= new Scanner(System.in);
        cn=sc.nextInt();
        for(int i=1;i<=3*cn;i++)ar[i]=sc.nextInt();
        arr[ar[1]][ar[2]]=0;
        arr[ar[2]][ar[1]]=0;
        arr2[ar[1]]=0;
        arr2[ar[2]]=0;
        
        for(int i=1;i<cn;i++){
            Vector<Tasd> ts =new Vector<Tasd>();
            int[]ar2=new int[4];
            for(int j=0;j<3;j++)ar2[j+1]=ar[3*i+j];
            if(ar2[1]==ar2[2]&&ar2[2]==ar2[3]){ak++;continue;}
            for(int j=0;j<3;j++){
                if(ar2[(j+1)%3+1]==ar2[(j+2)%3+1]){
                    int k=ar2[(j+1)%3+1];
                    for(int t=1;t<=cn;t++){
                        if(arr[k][t]==-1)continue;
                        Tasd z=new Tasd();
                        z.x=ar2[j+1];
                        z.y=t;
                        z.num=arr[k][t]+1;
                        ts.add(z);


                    }
                }
                if(arr[ar2[j+1]][ar2[j+1]]!=-1){
                    Tasd z=new Tasd();
                    z.x=ar2[(j+1)%3+1];
                    z.y=ar2[(j+2)%3+1];
                    z.num=arr[ar2[j+1]][ar2[j+1]]+1;
                    ts.add(z);
                }
                for(int t=1;t<=cn;t++){
                    if(arr2[t]==-1)continue;
                    Tasd z=new Tasd();
                    z.x=t;
                    z.y=ar2[j+1];
                    z.num=arr2[t];
                    ts.add(z);

                    
                }
                Tasd z=new Tasd();
                z.x=ar2[(j+1)%3+1];
                z.y=ar2[(j+2)%3+1];
                z.num=aj;
                ts.add(z);
            }
            for(Tasd z:ts){
               // System.out.println(z.x+" "+z.y+" "+z.num);
                aj=Math.max(aj,z.num);
                arr[z.x][z.y]=Math.max(arr[z.x][z.y],z.num);
                arr[z.y][z.x]=Math.max(arr[z.y][z.x],z.num);
                arr2[z.x]=Math.max(arr2[z.x],z.num);
                arr2[z.y]=Math.max(arr2[z.y],z.num);
            }
        }
        aj=Math.max(aj,arr[ar[3*cn]][ar[3*cn]]+1);
        int ans=ak+aj;
        System.out.println(ans);

    }
}