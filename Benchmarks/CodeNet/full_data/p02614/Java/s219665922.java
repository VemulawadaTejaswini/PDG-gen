import java.util.*;

class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int val = Integer.parseInt(sc.next());
    char[][] map = new char[h][w];
    for(int i=0;i<h;i++){
      map[i] = sc.next().toCharArray();
    }
    int res = 0;
    for(int i=0;i<(1<<h);i++){
      for(int j=0;j<(1<<w);j++){
        int count = 0;
        for(int k=0;k<h;k++){
          for(int l=0;l<w;l++){
            if(((i>>k) & 1)==0 && ((j>>l) & 1)==0 && map[k][l]=='#'){
              count++;
            }
          }
        }
        if(count==val){
          res++;
        }
      }
    }
    System.out.println(res);
  }
}