import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        while(tt>0){
            int[][] a=new int[3][15];
            int[] b=new int[9];
            int[] c=new int[9];
            for(int i=0;i<9;i++){
                b[i]=sc.nextInt();
            }
            for(int i=0;i<9;i++){
                String s=sc.next();
                if(s.equals("R")) c[i]=0;
                else if(s.equals("G")) c[i]=1;
                else c[i]=2;
            }
            for(int i=0;i<9;i++) a[c[i]][b[i]]++;
            int ans=0;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    for(int k=0;k<3;k++){
                        int s=9,t=9,u=9;
                        for(int bit=0;bit<(1<<3);bit++){
                            if((1&bit>>0)==1) s=7;
                            if((1&bit>>1)==1) t=7;
                            if((1&bit>>2)==1) u=7;
                            for(int x=1;x<=s;x++){
                                for(int y=1;y<=t;y++){
                                    for(int z=1;z<=u;z++){
                                        int[][] now=new int[3][15];
                                        if(s==7){
                                            now[i][x]++;
                                            now[i][x+1]++;
                                            now[i][x+2]++;
                                            
                                        }else now[i][x]+=3;
                                        if(t==7){
                                            now[j][y]++;
                                            now[j][y+1]++;
                                            now[j][y+2]++;
                                        }else{
                                            now[j][y]+=3;
                                            if(now[j][y]>=5) continue;
                                        }
                                        if(u==7){
                                            now[k][z]++;
                                            now[k][z+1]++;
                                            now[k][z+2]++;
                                            if(now[k][z]>=5||now[k][z+1]>=5||now[k][z+2]>=5) continue;
                                        }else{
                                            now[k][z]+=3;
                                            if(now[k][z]>=5) continue;
                                        }
                                        int flag=1;
                                        for(int A=0;A<3;A++){
                                            for(int B=1;B<=9;B++){
                                                if(a[A][B]!=now[A][B]) flag=0;
                                            }
                                        }
                                        if(flag==1){
                                            ans=1;
                                            break;
                                        }
                                    }
                                    if(ans==1) break;
                                }
                                if(ans==1) break;
                            }
                            if(ans==1) break;
                        }
                        if(ans==1) break;
                    }
                    if(ans==1) break;
                }
                if(ans==1) break;
            }
            System.out.println(ans);
            tt--;
        }
    }
}
