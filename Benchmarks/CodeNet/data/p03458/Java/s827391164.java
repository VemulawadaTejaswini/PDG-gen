
import java.util.*;

public class Main {

    static int[][]hsum;
    static int[][]wsum;
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        k=sc.nextInt();
        int[][]input=new int[k*2][k*2];
        hsum=new int[k*2+1][k*2];
        wsum=new int[k*2][k*2+1];
        int white=0;
        int tmpX,tmpY;
        for(int i=0;i<n;i++){
            tmpX=sc.nextInt();
            tmpY=sc.nextInt();
            if(sc.next().equals("B")){
                input[tmpX%(k*2)][tmpY%(k*2)]++;
            }else{
                white++;
                input[tmpX%(k*2)][tmpY%(k*2)]--;
            }
        }
        for(int i=0;i<k*2;i++){
            for(int j=1;j<k*2+1;j++){
                hsum[j][i]=hsum[j-1][i]+input[j-1][i];
                wsum[i][j]=wsum[i][j-1]+input[i][j-1];
            }
        }
        int[] ans=new int[k*2];
        int finalans=0;
        int tmp;
        for(int i=0;i<k;i++){
            ans[0]+=hsum[k][i]-hsum[0][i];
            ans[0]+=hsum[k*2][i+k]-hsum[k][i+k];
        }
        finalans=ans[0];
        int[]movex1={0,-1,-2};
        int[]movey1={0,1,0};
        int[]movex2={0,1,-1};
        int[]movey2={0,1,1};
        int[]movex3={0,-1,-2,0,1,-2};
        int[]movey3={0,-1,0,-2,-1,-2};
        int[]movex4={0,-1,1,-2,-1,1};
        int[]movey4={0,-1,-1,0,1,1};
        
        for(int i=1;i<k*2;i++){
            tmp=0;
            for(int j=0;j<3;j++){
                tmp+=getsum(i+k+k*movex1[j]-1,k*movey1[j],i+k+k*movex1[j]-1,k-1+k*movey1[j]);
            }
            for(int j=0;j<3;j++){
                tmp-=getsum(i-1+k*movex2[j],k*movey2[j],i-1+k*movex2[j],k-1+k*movey2[j]);
            }
            ans[i]=ans[i-1]+tmp;
            finalans=Math.max(finalans,ans[i]);
        }
        for(int i=1;i<k*2;i++){
            for(int j=1;j<k*2;j++){
                tmp=0;
                for(int l=0;l<6;l++){
                    tmp+=getsum(i+k*movex3[l],j+k+k*movey3[l]-1,i+k-1+k*movex3[l],j+k+k*movey3[l]-1);
                }
                for(int l=0;l<6;l++){
                    tmp-=getsum(i+k*movex4[l],j-1+k*movey4[l],i+k-1+k*movex4[l],j-1+k*movey4[l]);
                }
                ans[i]+=tmp;
                finalans=Math.max(finalans,ans[i]);
            }
        }
        System.out.println(white+finalans);
    }
    static int getsum(int x1,int y1,int x2,int y2){
        if(x1==x2&&x1>=0&&x1<k*2){
            y1=Math.max(0, Math.min(k*2-1, y1));
            y2=Math.max(0, Math.min(k*2-1, y2));
            return wsum[x1][y2]-wsum[x1][y1];
        }else if(y1==y2&&y1>=0&&y1<k*2){
            x1=Math.max(0, Math.min(k*2-1, x1));
            x2=Math.max(0, Math.min(k*2-1, x2));
            return hsum[x2][y1]-hsum[x1][y1];
        }else{
            return 0;
        }
    }

}
