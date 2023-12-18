import java.util.*;
public class Main {
	public static void main(String[] args)throws Exeption{
      Scanner scn = new Scanner(System.in);
      int h = scn.nextInt();
      int w = scn.nextInt();
      char[][] a = new char[h][w];
      for(int i=0; i<h; ++i){
        String str = scn.next();
        for(int j=0; j<w; ++j){
          a[i][j] = str.charAt(j);
        }
      }
      int[] hh = new int[h];
      int c = 0;
      for(int i=0; i<h; ++i){
        int count = 0;
        for(int j=0; j<w; ++j){
          if(a[i][j]=='.'){
            count = count + 1;
          }
        }
          if(count != w){
          	hh[c] = i;
            c = c + 1;
          }
      }
      int[] ww = new int[w];
      int d=0;
      for(int j=0; j<w; ++j){
        int count = 0;
        for(int i=0; i<h; ++i){
          if(a[i][j]=='.'){
            count = count + 1;
          }
        }
          if(count != h){
          	ww[d] = j;
            d = d + 1;
          }
      }
      for(int i=0; i<c; ++i){
        for(int j=0; j<d; ++j){
        	System.out.print(a[hh[i]][ww[j]]);
        	System.out.println();
        }
      }
    }
}
