import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String S[][] = new String[H+2][W+2];
    String tmp = "";
    for(int i=0;i<W+2;i++){
      S[0][i]=".";
      S[H+1][i]=".";
    }
    for(int i=0;i<H+2;i++){
      S[i][0]=".";
      S[i][W+1]=".";
    }
    for(int i=1;i<H+1;i++){
      tmp=sc.next();
      for(int j=1;j<W+1;j++){
        S[i][j]=tmp.substring(j-1,j);
      }
    }
    for(int i=1;i<H+1;i++){
      for(int j=1;j<W+1;j++){
        if(S[i][j].equals(".")){
          S[i][j]=cntMine(S,i,j);
        }
      }
    }
    
    for(int i=1;i<H+1;i++){
      for(int j=1;j<W+1;j++){
        System.out.print(S[i][j]);
      }
      System.out.println("");
    }
  }
  
  public static String cntMine(String[][] S,int h,int w){
    int res =0;
    for(int i=0;i<3;i++){
      if(S[h-1][w-1+i].equals("#")){
        res=res+1;
      }
    }
    if(S[h][w-1].equals("#")){
      res++;
    }
    if(S[h][w+1].equals("#")){
      res++;
    }
    for(int i=0;i<3;i++){
      if(S[h+1][w-1+i].equals("#")){
        res++;
      }
    }
    return String.valueOf(res);
  }

  
}