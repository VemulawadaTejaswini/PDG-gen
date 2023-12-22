

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 

 class Main{
             static int[][] map=new int[12][12];
             static boolean[][] counted=new boolean[12][12];
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             while((line=br.readLine())!= null){if(line.isEmpty())continue;
                for(int i=0;i<12;i++)map[0][i]=Integer.parseInt(line.charAt(i)+"");
                for(int i=1;i<=11;i++){
                    line=br.readLine();
                    //System.out.println(line);
                    for(int j=0;j<12;j++)map[i][j]=Integer.parseInt(line.charAt(j)+"");
                }for(int i=0;i<12;i++)for(int j=0;j<12;j++)counted[i][j]=false;
                //for(int[] aa:map){System.out.println(Arrays.toString(aa));}
                int islanC=0;
                for(int i=0;i<12;i++){
                    for(int j=0;j<12;j++){
                        if(map[i][j]!=0&&!counted[i][j]){
                           // System.out.println("deli");
                            islanC++;countIsl(i,j);}
                    }
                }
                 System.out.println(islanC);
                 
                 
             }
             
         }catch(Exception e){}         
     }
     static void countIsl(int y,int x){
         if(counted[y][x])return; 
         else{//System.out.println("MK x-y:"+x+"-"+y);
            counted[y][x]=true;
         }
         if(y!=0)if(map[y-1][x]!=0)countIsl(y-1,x);
         if(y!=11)if(map[y+1][x]!=0)countIsl(y+1,x);
         if(x!=11)if(map[y][x+1]!=0)countIsl(y,x+1);
         if(x!=0)if(map[y][x-1]!=0)countIsl(y,x-1);
     }
     
    
 }