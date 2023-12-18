import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h, w;
    h = sc.nextInt();
    w = sc.nextInt();

    int num_sharp =0;
    char[][] map = new char[h+2][w+2];
    for(int i=0; i<w+2; i++){ map[0][i]='#'; }
    for(int i=1; i<h+1; i++){
      String s_row = sc.next();
      map[i][0]='#';
      for(int j=1; j<w+1; j++){
        map[i][j]=s_row.charAt(j-1);
        if(s_row.charAt(j-1)=='#'){num_sharp++;}
      }
      map[i][w+1]='#';
    }
    for(int i=0; i<w+2; i++){ map[h+1][i]='#'; }

    int dis = Integer.MAX_VALUE;
    Deque<Integer> col = new ArrayDeque<Integer>();
    Deque<Integer> row = new ArrayDeque<Integer>();
    Deque<Integer> distance = new ArrayDeque<Integer>();
    col.addLast(1);
    row.addLast(1);
    distance.addLast(1);

    while(row.size()>=0){
      int col_num = col.poll();
      int row_num = row.poll();
      int dis_ = distance.poll();
      //System.out.println(col_num);
      if(col_num == w && row_num == h){
        dis = dis_;
        break;
      }
      if(map[row_num+1][col_num]=='.'){
        row.addLast(row_num+1);
        col.addLast(col_num);
        distance.addLast(dis_+1);
      }
      if(map[row_num][col_num+1]=='.'){
        row.addLast(row_num);
        col.addLast(col_num+1);
        distance.addLast(dis_+1);
      }
      if(map[row_num-1][col_num]=='.'){
        row.addLast(row_num-1);
        col.addLast(col_num);
        distance.addLast(dis_+1);
      }
      if(map[row_num][col_num-1]=='.'){
        row.addLast(row_num);
        col.addLast(col_num-1);
        distance.addLast(dis_+1);
      }
      map[row_num][col_num]='#';
    }
    if(dis==Integer.MAX_VALUE){System.out.println(-1);}
    else{System.out.println(h*w-num_sharp-dis);}
  }
}