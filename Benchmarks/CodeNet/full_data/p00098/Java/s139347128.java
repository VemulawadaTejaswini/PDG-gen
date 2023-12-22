

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
 
 
 
 class Main{
      
    static int aa[][];//
    static int n;
    static int max=Integer.MIN_VALUE;
    static HashMap<Integer, Integer> hT = new HashMap<Integer,Integer>();
    static HashMap<Integer, Integer> hT_nex = new HashMap<Integer,Integer>();
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             line=br.readLine();n=Integer.parseInt(line);
             aa=new int[n][n];
             for(int i=0; i<n;i++){String spl[] = br.readLine().split(" ");
             for(int j=0;j<n;j++)aa[i][j]=Integer.parseInt(spl[j]);}
             remenber=new int[n][n][n][n];
             checked=new boolean[n][n];
             cutOutTop();
             System.out.println(max);
             
         }catch(Exception e){}         
     }
      
    static boolean checked[][];
    static void cutOutTop(){
        //System.out.println("aa");
        for(int totalS=2; totalS<=2*n;totalS++){
            int xLow = (totalS<=n+1)? 1:totalS-n;
            int xB = (totalS-1<=n)? totalS-1:n;
            System.out.println("xl xb"+xLow+" "+xB);
            for(int xW=xLow;xW<=xB;xW++ ){
                int yB=totalS-xW;
                for(int yW=yB;yW<=yB;yW++){
                    cutOut(xW,yW);
                }
            }
            hT=hT_nex;//System.out.println("aa");
            /*for(int key:hT.keySet()){
                System.out.println("key"+key+"s"+hT.get(key));
            }*/
            hT_nex=new HashMap<Integer,Integer>();//System.out.println("bb");
        }
    }
    static void cutOut(int xW, int yW){
        //f(checked[xW-1][yW-1])return;
        /*if(xW==2&&yW==2){
            System.out.println("emp");
            for(int key:hT.keySet()){
                System.out.println("key"+key+"s"+hT.get(key));
            }
        }*/
        for(int i=0; i<n-xW+1; i++){
            for(int j=0; j<n-yW+1;j++){
                int cal = cal(i,j,xW,yW);
                if(max<cal){max=cal;}//System.out.println("xW yW i j"+xW+" "+yW+" "+i+" "+j+" "+cal);}
            }
        }
        checked[xW-1][yW-1]=true;
        
    }
    static int[][][][] remenber;
      static int cal(int x, int y, int xWid, int yWid){
          int res=0;
          if(xWid>=2){if(checked[xWid-2][yWid-1]==true){
              for(int j=y;j<y+yWid;j++){
                  res+=aa[j][x+xWid-1];
              }res+=hT.get(x*1000000+y*10000+(xWid-2)*100+yWid-1);//remenber[x][y][xWid-2][yWid-1];
             hT_nex.put(x*1000000+y*10000+(xWid-1)*100+yWid-1,res);return res;
          }}
          if(yWid>=2){if(checked[xWid-1][yWid-2]==true){
              for(int i=x;i<x+xWid;i++){
                  res+=aa[y+yWid-1][i];
              }res+=hT.get(x*1000000+y*10000+(xWid-1)*100+yWid-2);//remenber[x][y][xWid-2][yWid-1];
             hT_nex.put(x*1000000+y*10000+(xWid-1)*100+yWid-1,res);return res;
          }}//System.out.println("bb");
          //if(remenber[x][y][xWid-1][yWid-1]!=0)return remenber[x][y][xWid-1][yWid-1];
          for(int i=x;i<x+xWid;i++){
              for(int j=y;j<y+yWid;j++){
                  res+=aa[j][i];
              }
          }
          //System.out.println("aa");
          hT_nex.put(x*1000000+y*10000+(xWid-1)*100+yWid-1,res);
        return res;
      }
 }