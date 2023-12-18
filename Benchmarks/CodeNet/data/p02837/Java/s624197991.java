
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<ArrayList<Node>> al = new ArrayList();
    al.add(new ArrayList());
    for(int i = 1; i <= n; i++) {
      int tm = sc.nextInt();
      al.add(new ArrayList());
      for(int j = 0; j < tm; j++) {
        al.get(i).add(new Node(sc.nextInt(),sc.nextInt()));
      }
    }
    int ans = 0;
    for(int i = 1; i<=n; i++) {
      HashSet<Integer> tru = new HashSet();
      HashSet<Integer> fals = new HashSet();
      tru.add(i);
      boolean ok = true;
      for(Node nd: al.get(i)) {
        if(nd.y==0) fals.add(nd.x);
        else tru.add(nd.x);
      }
      for(Node nd: al.get(i)) {
        if(nd.y==1) {
          for(Node dnd: al.get(nd.x)) {
            if(dnd.y==1) {
              if(fals.contains(dnd.x)) {
                ok = false;
                break;
              }
            } else {
              if(tru.contains(dnd.x)) {
                ok = false;
                break;
              }
            }
          }
          if(ok) {
            tru.add(nd.x);
            for(Node dnd : al.get(nd.x)) {
              if(dnd.y==0) {
                fals.add(dnd.x);
              } else {
                tru.add(dnd.x);
              }
            }
          } else {
            break;
          }
        }
      }
      for(int j = 1; j <= n; j++) {
        if(!tru.contains(j) &&! fals.contains(j)) {
          for(Node nd: al.get(j)) {
            if(nd.y==0) {
              if(tru.contains(nd.x)) {
                fals.add(j);
                break;
              }
            } else {
              if(fals.contains(nd.x)) {
                fals.add(j);
                break;
              }
            }
          }
        }
      }
      if(ok) {
        ans = Math.max(ans,n-fals.size());
      }
    }
    System.out.println(ans);
  }
  
  static class Node {
    int x,y;
    Node(int x, int y) {
      this.x=x;
      this.y=y;
    }
  }

}
