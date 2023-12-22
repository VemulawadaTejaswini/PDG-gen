


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
 
 
 class Main{
      
    static int aa[][];//
    static int n;
    static int max=Integer.MIN_VALUE;
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
        for(int xW=1;xW<=n;xW++ ){
            for(int yW=1;yW<=n;yW++){
                cutOut(xW,yW);
            }
        }
    }
    static void cutOut(int xW, int yW){
        if(checked[xW-1][yW-1])return;
        for(int i=0; i<n-xW+1; i++){
            for(int j=0; j<n-yW+1;j++){
                int cal = cal(i,j,xW,yW);
                if(max<cal){max=cal;}//System.out.println("xW yW i j"+xW+" "+yW+" "+i+" "+j+" "+cal);}
            }
        }
        checked[xW-1][yW-1]=true;
        if(xW<n)cutOut(xW+1,yW);
        if(yW<n)cutOut(xW,yW+1);
    }
    static int[][][][] remenber;
      static int cal(int x, int y, int xWid, int yWid){
          int res=0;
          if(xWid>=2){if(checked[xWid-2][yWid-1]==true){
              for(int j=y;j<y+yWid;j++){
                  res+=aa[j][x+xWid-1];
              }res+=remenber[x][y][xWid-2][yWid-1];
              remenber[x][y][xWid-1][yWid-1]=res;return res;
          }}
          if(yWid>=2){if(checked[xWid-1][yWid-2]==true){
              for(int i=x;i<x+xWid;i++){
                  res+=aa[y+yWid-1][i];
              }res+=remenber[x][y][xWid-1][yWid-2];
              remenber[x][y][xWid-1][yWid-1]=res;return res;
          }}//System.out.println("bb");
          //if(remenber[x][y][xWid-1][yWid-1]!=0)return remenber[x][y][xWid-1][yWid-1];
          for(int i=x;i<x+xWid;i++){
              for(int j=y;j<y+yWid;j++){
                  res+=aa[j][i];
              }
          }
          remenber[x][y][xWid-1][yWid-1]=res;
        return res;
      }
 }