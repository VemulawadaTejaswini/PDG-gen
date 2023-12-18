import java.util.*;
public class Main{
  static long aa[][];
	static long maxx(int[] ww,int[] v,int ind,int w){
    	  if(ind>=v.length || w==0 ){return 0;}
            if(aa[ind][w]!=-1){return aa[ind][w];}
          if(w-ww[ind]<0){
          	return aa[ind][w]=maxx(ww,v,ind+1,w); 
          }
          else{
          return aa[ind][w]=Math.max( maxx(ww,v,ind+1,w-ww[ind])+(long)v[ind],
                                     maxx(ww,v,ind+1,w));
          }
      
    }
  public static void main(String[] args){
  	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int w=s.nextInt();
    int[] ww=new int[n],v=new int[n];
    aa=new long[n][w+1];
    for(int j=0;j<n;j++){
    	ww[j]=s.nextInt();
        v[j]=s.nextInt();
      for(int i=0;i<=w;i++){aa[j][i]=-1; }
    }
    System.out.println(maxx(ww,v,0,w)); 
  
  }

}