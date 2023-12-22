import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static int[] a;
  static final int MAX_LEN = 2000000;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    Heap h = new Heap(MAX_LEN + 10);
    List<Integer> ans = new ArrayList<>();

    String[] in = br.readLine().split(" ");

    while(!in[0].equals("end")){
      if(in[0].equals("insert")){
        h.insert(Integer.parseInt(in[1]));
      }else if(in[0].equals("extract")){
        ans.add(h.extractMax());
      }
      in = br.readLine().split(" ");
    }

    br.close();

    for(int i = 0; i < ans.size(); i++){
      System.out.println(ans.get(i));
    }

  }
}

class Heap {

  static final int INITIAL_VAL = Integer.MIN_VALUE;
  int length;
  int[] ar;

  Heap(int n){
    this.length = 0;
    this.ar = new int[n];
    //Arrays.fill(ar, INITIAL_VAL);
  }

  Heap(int[] ori){
    this.length = ori.length;
    this.ar = ori.clone();
  }

  // MUST be tested
  // data in "ar" may be LOST
  //   when newSize < length
  public void resize(int newSize){
    int[] newAr = new int[newSize];
    for(int i = 0; i < Math.min(length, newSize); i++){
      newAr[i] = ar[i];
    }
    ar = newAr;
  }

  public void buildMaxHeap(){
    for(int i = length / 2; i >= 0; i--){
      maxHeapify(i);
    }
    return;
  }

  public void maxHeapify(int idx){
    int lIdx = 2 * idx + 1, rIdx = 2 * idx + 2;
    int largest = idx;

    if(lIdx < length && ar[lIdx] > ar[idx]){
      largest = lIdx;
    }
    if(rIdx < length && ar[rIdx] > ar[largest]){
      largest = rIdx;
    }

    if(largest != idx){
      int tmp = ar[idx];
      ar[idx] = ar[largest];
      ar[largest] = tmp;
      maxHeapify(largest);
    }
    return;
  }

  public void insert(int val){

    this.ar[length] = val;
    this.length++;

    int idx = length-1, parIdx = (idx-1)/2;

    while(idx > 0 && ar[idx] > ar[parIdx]){
      int tmp = ar[idx];
      ar[idx] = ar[parIdx];
      ar[parIdx] = tmp;
      idx = parIdx;
      parIdx = (parIdx-1)/2;
    }
    return;
  }

  public int extractMax(){

    if(length == 0) return INITIAL_VAL;
    int ret = this.ar[0];
    this.length--;
    this.ar[0] = this.ar[length];

    maxHeapify(0);

    return ret;
  }

  @Override
  public String toString() {
    StringBuilder ret = new StringBuilder("length = " + length + ",\n{ ");
    for(int i = 0; i < length; i++){
      if(i > 0) ret.append(", ");
      ret.append(ar[i]);
    }
    ret.append(" }");
    return ret.toString();
  }

}
