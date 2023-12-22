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
    }

    int hmax = 0;
    int hidx = 0;
    for(int i=0; i<hcount.length; i++){
      if(hmax < hcount[i]){
        hmax = hcount[i];
        hidx = i;
      }
    }

    int wmax = 0;
    int widx = 0;
    for(int i=0; i<w.length; i++){
      if(h[i] != hidx){
        wcount[w[i]]++;
      }
    }

    for(int i=0; i<wcount.length; i++){
      if(wmax < wcount[i]){
        wmax = wcount[i];
        widx= i;
      }
    }

    int result1 = hmax + wmax;

    hcount = new int[H+1];
    wcount = new int[W+1];

    for(int i=0; i<M; i++){
      wcount[h[i]]++;
    }

    wmax = 0;
    widx = 0;
    for(int i=0; i<wcount.length; i++){
      if(wmax < wcount[i]){
        wmax = wcount[i];
        widx = i;
      }
    }

    hmax = 0;
    hidx = 0;
    for(int i=0; i<M; i++){
      if(w[i] != widx){
        hcount[h[i]]++;
      }
    }

    for(int i=0; i<hcount.length; i++){
      if(hmax < hcount[i]){
        hmax = hcount[i];
        hidx= i;
      }
    }

    int result2 = hmax + wmax;

    if(result1 > result2){
      System.out.println(result1);
    }else{
      System.out.println(result2);
    }

    return;

  }
}