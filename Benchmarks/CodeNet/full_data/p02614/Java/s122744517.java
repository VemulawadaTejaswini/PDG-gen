import java.util.*;

public class Main{
  public static void main(String aargs[]){
    Scanner sc = new Scanner(System.in);
    
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    sc.nextLine();
    char[][] map = new char[h][w];
    int ans = 0;
    
    for(int i = 0; i < h; i++){
      String str = sc.nextLine();
      for(int j = 0; j < w; j++){
      	map[i][j] = str.charAt(j);
      }
    }
    
    for(int i = 0; i < Math.pow(2, h); i++){
      for(int j = 0; j < (int)Math.pow(2, w); j++){
        int ii = i;
        
        int black = 0;
		for(int s = h - 1; s >= 0; s--){
          int ss = (int)Math.pow(2, s);
          int jj = j;
          for(int t = w - 1; t >= 0; t--){
            int tt = (int)Math.pow(2, t);
            if(ii / ss == 0 && jj / tt == 0 && map[s][t] == '#'){
              black++;
            }
            
            
            jj %= tt;
          }
          ii %= ss;
        }
        
        if(black == k){
          ans++;
        }
      }
    }
    
    System.out.println(ans);
    
  }
}