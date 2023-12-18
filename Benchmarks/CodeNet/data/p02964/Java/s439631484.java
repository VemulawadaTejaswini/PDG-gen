import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      long K = Long.parseLong(sc.next());
      int[] list = new int[N];
      for(int i=0;i<N;i++){
        list[i] = Integer.parseInt(sc.next());
      }
      long loopCnt = 0l;
      HashMap<Long, String> anss = new HashMap<Long, String>();
      String st = null;
      LinkNode node = null;
      for(long i=0;i<K;i++){
        node = calc(list, node);
        String ans = node!=null?LinkNode.toString(node.start):"";
        if(st==null) st = ans;
        else if(st.equals(ans)) break;
        anss.put(i, ans);
        loopCnt++;
      }
      System.out.println(anss.get((K-1)%(loopCnt)));
    }
    public static LinkNode calc(int[] list, LinkNode node){
      if(node != null && node.start != null && node.start.prev != null)node.start.prev = null;
      int size = list.length;
      int value = 0;
      for(int i=0;i<size;i++){
        value = list[i];
        LinkNode nextNode = new LinkNode();
        if(node != null && node.map.containsKey(value)){
          LinkNode prevNode = node.map.get(value).prev;
          if(prevNode == null){
            nextNode = null;
          }else{
            nextNode = prevNode;
            nextNode.next = null;
          }
        }else if(node != null){
            nextNode.setValue(node, value);
        }else{
          nextNode.setValue(value);
        }
        node = nextNode;
      }

      return node;
    }
    public static class LinkNode{
      public LinkNode start = null;
      public LinkNode next = null;
      public LinkNode prev = null;
      public int value;
      public HashMap<Integer,LinkNode> map = new HashMap<Integer,LinkNode>();
      LinkNode(){
        this.start = this;
      }
      public void setValue(int v){
        this.value = v;
        this.map.put(v, this);
      }
      public void setValue(LinkNode prevNode, int v){
        this.value = v;
        prevNode.next = this;
        this.start = prevNode.start;
        this.prev = prevNode;
        this.map = new HashMap<Integer,LinkNode>(prevNode.map);
        this.map.put(v, this);
      }
      public static String toString(LinkNode node){
        StringBuilder sb = new StringBuilder();
        do{
          sb.append(node.value).append(" ");
          node = node.next;
        }while(node != null);
        return sb.toString();
      }
    }
}
