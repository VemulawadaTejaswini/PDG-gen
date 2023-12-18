import java.io.*;
import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int c[] = new int[4];
    for(int i=0;i<n;i++)
      c[in.nextInt()]++;

    double mem[][][] = new double[n+1][n+1][n+1];
    System.out.println(myfun(mem, c[1], c[2], c[3], n));
  }

  public static double myfun(double mem[][][], int c1, int c2, int c3, int n){
    int c = c1+c2+c3;
    if(c==0) return 0.0;
    if(mem[c1][c2][c3] !=0 ) return mem[c1][c2][c3];

    mem[c1][c2][c3] = n/(double)c; //Expected throws to not eat piece

    if(c1!=0) mem[c1][c2][c3] += myfun(mem, c1-1, c2, c3, n) * (c1 / (double)c);
    if(c2!=0) mem[c1][c2][c3] += myfun(mem, c1+1, c2-1, c3, n) * (c2 / (double)c);
    if(c3!=0) mem[c1][c2][c3] += myfun(mem, c1, c2+1, c3-1, n) * (c3 / (double)c);

    return mem[c1][c2][c3];
  }
}