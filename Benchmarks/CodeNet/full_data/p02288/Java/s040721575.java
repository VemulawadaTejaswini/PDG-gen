import java.util.*;

public class Main{
  Scanner sc = new Scanner(System.in);
  StringBuilder sb = new StringBuilder();

  int H;
  int[] A;

  public static void main(String[] args){
    Main main = new Main();
    main.in();    
    main.buildMaxHeap();
    main.out();
  }

  public void in(){
    H = sc.nextInt();
    A = new int[H + 1];
    for(int i = 1;i < A.length;i++){
      A[i] = sc.nextInt();
    }
  }
  public void maxHeapify(int i){
    int right = (2 * i) + 1;
    int left = 2 * i;
    int largest;
    int tmp;

    if(left <= H && A[left] > A[i]){
      largest = left;
    }
    else {
      largest = i;
     }
     if(right <= H && A[right] > A[largest]){
       largest = right;
     }
     if(largest != i){
       tmp = A[i];
       A[i] = A[largest];
       A[largest] = tmp;
       maxHeapify(largest);
     } 
  }
  public void out(){
    for(int i = 1;i < A.length;i++){
      sb.append(" ").append( Integer.toString(A[i]) );
    }
    System.out.println(sb.toString());
  }
  public void buildMaxHeap(){
    for(int i = (H / 2);i >= 1;i--){
      maxHeapify(i);
    }
  }
 
}
