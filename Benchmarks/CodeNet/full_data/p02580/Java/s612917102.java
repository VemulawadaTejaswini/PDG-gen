import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int H = sc.nextInt();
    int W = sc.nextInt();
    int M = sc.nextInt();
    
    int[] h = new int[M];
    int[] w = new int[M];

    int[] hcount = new int[H + 1];
    int[] wcount = new int[W + 1];

    boolean[][] bom = new boolean[H+1][W+1];

    for(int i=0; i<M; i++){
      h[i] = sc.nextInt();
      w[i] = sc.nextInt();
      hcount[h[i]]++;
      wcount[w[i]]++;
      bom[h[i]][w[i]] = true;
    }

    ArrayList<Integer> hcand = new ArrayList<Integer>();
    ArrayList<Integer> wcand = new ArrayList<Integer>();

    int hmax = 0;
    for(int i=0; i<hcount.length; i++){
      if(hmax < hcount[i]){
        hmax = hcount[i];
      }
    }

    for(int i=0; i<hcount.length; i++){
      if(hcount[i] == hmax){
        hcand.add(i);
      }
    }

    int wmax = 0;
    for(int i=0; i<wcount.length; i++){
      if(wmax < wcount[i]){
        wmax = wcount[i];
      }
    }

    for(int i=0; i<wcount.length; i++){
      if(wcount[i] == wmax){
        wcand.add(i);
      }
    }

    for (Integer widx : wcand) {
      for (Integer hidx : hcand) {
        if(!bom[hidx][widx]){
          System.out.println(hmax + wmax);
        }
      }
    }

    System.out.println(hmax + wmax - 1);

    return;

  }
}
