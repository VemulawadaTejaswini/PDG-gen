import java.util.*;
import java.io.*;


class Main{

    public static void main(String args[])throws IOException{
    int i, j;
    int a;
    int n;
    int v;
    int count = 0;
    int nodeNum;
    int[][] G = new int[105][105];
    int[] mCost = new int[105];
    boolean[] u = new boolean[105];
    Scanner scan = new Scanner(System.in);

    n = scan.nextInt();
    for(i=0 ; i<n ; i++){
        for(j=0 ; j<n ; j++){
        G[i][j]=5000000;
        }
    }
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //String s;

    for(i=0 ; i<n ; i++){
        nodeNum = scan.nextInt();
        //s = bf.readLine();
        //nodeNum = Integer.parseInt(s);
        a = scan.nextInt();
        for(j=0 ; j<a ; j++){
          G[nodeNum][scan.nextInt()] = scan.nextInt();
        }
    }

    for(i=0 ; i<n ; i++){
        mCost[i] = 999999;
        u[i] = false;
    }

    mCost[0] = 0;

    while(true){
        v = -1;

        for(i=0 ; i<n ; i++){
          if( !u[i] && (v == -1 || mCost[i] < mCost[v]) ){
              v = i;
          }
        }

        if(v == -1){break;}
        u[v] = true;
        count += mCost[v];

        for(i=0 ; i<n ; i++){
          mCost[i] = Math.min(mCost[i], G[v][i] + mCost[v]);
        }
    }

    for(i=0 ; i<n ; i++){
      System.out.println(i + " " + mCost[i]);
    }
    }
}

