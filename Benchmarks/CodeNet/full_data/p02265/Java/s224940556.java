import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    ArrayDeque<Integer> list = new ArrayDeque<Integer>();
    for(int i = 0; i < n; i++){
      String[] tmp = br.readLine().split(" ");
      if(tmp[0].equals("insert")){
        list.addFirst(Integer.parseInt(tmp[1]));
      }else if(tmp[0].equals("deleteFirst")){
        list.removeFirst();
      }else if(tmp[0].equals("deleteLast")){
        list.removeLast();
      }else{
        list.remove(Integer.parseInt(temp[1]));
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append(list.poll());
    while(list.peekFirst() != null){
      sb.append(" ").sppend(list.poll());
    }
    System.out.println(sb);
  }
}