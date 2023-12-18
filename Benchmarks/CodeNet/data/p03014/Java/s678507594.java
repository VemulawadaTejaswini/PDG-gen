import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    String x[][] = new String[h][w];

    int t = 0;
    int ans = 0;
    String s;
    
    for (int i=0; i<h; i++){
      s = sc.next();
      for(int j=0; j<w; j++){
	    x[i][j] = s.substring(j,j+1);
      }
    }
    
    for (int i=0; i<h; i++){
      for(int j=0; j<w; j++){
	    if (x[i][j].equals("#")){
          continue;
        } else {
          t = 0;
          for(int a=i; a>=0; a--){
			if(x[a][j].equals(".")){
              t++;
            } else {
              break;
            }
          }
          for(int b=i; b<h; b++){
			if(x[b][j].equals(".")){
              t++;
            } else {
              break;
            }
          }
          for(int c=j; c>=0; c--){
			if(x[i][c].equals(".")){
              t++;
            } else {
              break;
            }
          }
          for(int d=j; d<w; d++){
			if(x[i][d].equals(".")){
              t++;
            } else {
              break;
            }
          }
          if(t-3>ans){
            ans = t-3;
          }
        }
      }
    }

    System.out.println(ans);
  }
}
