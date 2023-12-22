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

    for(int i=0; i<M; i++){
      h[i] = sc.nextInt();
      w[i] = sc.nextInt();
      hcount[h[i]]++;
      wcount[w[i]]++;
    }

    ArrayList<Integer> hcand = new ArrayList<Integer>();

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

    ArrayList<Integer> wcand = new ArrayList<>();

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

    for (Integer hidx : hcand) {
      for(Integer widx : wcand){
        boolean noDuplicationFlag = true;
        for(int i=0; i<M; i++){
          if(h[i] == hidx && w[i] == widx){
            noDuplicationFlag = false;
            break;
          }
        }

        if(noDuplicationFlag){
          System.out.println(hmax+wmax);
          return;
        }
      }
    }

    System.out.println(hmax + wmax - 1);

    return;

  }
}