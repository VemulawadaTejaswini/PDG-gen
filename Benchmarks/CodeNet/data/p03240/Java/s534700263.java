import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int box[][] = new int[n][3];
    int x,y,h;
    boolean once = true;
    //1件先読み 理由:初期値ないかもしれないって怒られるから
    box[0][0] = sc.nextInt(); box[0][1] = sc.nextInt(); box[0][2] = sc.nextInt();
    x = box[0][0]; y = box[0][1]; h = box[0][2];
    for(int i=1; i<n; i++){
      box[i][0] = sc.nextInt();
      box[i][1] = sc.nextInt();
      box[i][2] = sc.nextInt();
      if(once && box[i][2] > 0){
        x = box[i][0]; y = box[i][1]; h = box[i][2];
        once = false;
      }
    }
    for(int cx=0; cx<=100; cx++){
      for(int cy=0; cy<=100; cy++){
        int ch = h + Math.abs(cx - x) + Math.abs(cy - y);
        boolean answer = true;
        for(int i=0; i<n; i++){
          int ch_x,ch_y,ch_h,calc_h;
          ch_x = box[i][0];
          ch_y = box[i][1];
          ch_h = box[i][2];
          calc_h = Math.max(ch - Math.abs(cx - ch_x) - Math.abs(cy - ch_y),0);
          if(ch_h != calc_h) answer = false;
        }//i
        if(answer) System.out.println(cx + " " + cy + " " + ch);
      }//cy
    }//c
  }
}
