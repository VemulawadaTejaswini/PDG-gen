import java.io.*;
import java.util.*;

class Main{

  public static int i, H;
  public static int[] A;

  public static void main(String[] args){
    String s;
    try{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      s = bf.readLine();
      H = Integer.parseInt(s);
      A = new int[H+1];

      StringTokenizer S = new StringTokenizer(bf.readLine());
      //配列の初期化
      for(i=1 ; i<=H ; i++){
        A[i] = Integer.parseInt(S.nextToken());
      }
      bf.close();
    }
    catch(IOException e){
      System.out.println(e);
    }
    /*for(i=1 ; i<=H ; i++){
      System.out.println(A[i]);
    }*/
    buildMaxHeap(A);
    StringBuffer sb = new StringBuffer();
    for(i=1 ; i<=H ; i++){
	   	sb.append(" "+A[i]);
		}
    //sb.append(A[i]);
	 	System.out.println(sb);
  }

  public static void maxHeapify(int A[], int i){
    int l, r, largest, a;
    l = left(i);
    r = right(i);
    //左の子、自分、右の子で最大のノードをえらぶ
    if( l <= H && A[l] > A[i] ){
      largest = l;
    }
    else{
      largest = i;
    }
    if( r <= H && A[r] > A[largest] ){
      largest = r;
    }

    if( largest != i ){
        a = A[i];
        A[i] = A[largest];
        A[largest] = a;
      maxHeapify(A, largest);
        }
  }
  public static void buildMaxHeap(int A[]){
    for(i = H/2 ; i>=1 ; i--){
      maxHeapify(A, i);
    }
  }
  public static int left(int i){
    //if( i*2 <= H ) {
      return i*2;
    //}
  }
  public static int right(int i){
    //if( i*2+1 <= H ) {
      return i*2+1;
    //}
  }

}

