import java.io.*;
import java.lang.Integer;
import java.util.*;

class Main{
  public static void main(String args[])throws Exception{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int n = Integer.parseInt(br.readLine());
    ControlList doubly_list = new ControlList();
    for(int i = 0 ; i<n+1; i++){
      // String [] s = br.readLine().split("\\s+");
      String [] s = sc.nextLine().split("\\s+");
      if(s[0].equals("insert")){
        doubly_list.insert(Integer.valueOf(s[1]));
      }else if(s[0].equals("delete")){
        doubly_list.delete(Integer.valueOf(s[1]));
      }else if(s[0].equals("deleteFirst")){
        doubly_list.deleteFirst();
      }else if(s[0].equals("deleteLast")){
        doubly_list.deleteLast();
      }
    }
    doubly_list.Print_list();
  }
}
//list操作
class ControlList{
  private List dummy;
  public ControlList(){
    dummy = new List();
    dummy.next=dummy;
    dummy.previous=dummy;
  }
  //insert
  public void insert(int n){
    List list = new List(n);
    list.next=dummy.next;
    dummy.next.previous=list;
    dummy.next=list;
    list.previous=dummy;
  }
  //ノードの削除メソッド
  public void deleteNode(List delete){
    if( delete == dummy)return;
    delete.previous.next=delete.next;
    delete.next.previous=delete.previous;
  }
  //指定したノードの削除
  public void delete(int n){
    deleteNode(listSearch(n));
  }
  //firstnode削除
  public void deleteFirst(){
    deleteNode(dummy.next);
  }
  //lastnode削除
  public void deleteLast(){
    deleteNode(dummy.previous);
  }
  //keyを使ってノードを探索
  public List listSearch(int n){
    List cur = dummy.next;
    while(cur.data!=n && cur!=dummy){
      cur = cur.next;
    }
    return cur;
  }
  //printメソッド
  public void Print_list(){
    List list = dummy.next;
    int isf = 0;
    while(true){
      if(list == dummy)break;
      if(isf++ >0)System.out.printf(" ");
      System.out.printf("%d", list.data);
      list = list.next;
    }
    System.out.println();
  }
}

  //listの構造体的役割
  class List{
    public int data;
    public List next;
    public List previous;

    public List(){
    }

    public List(int n){
      this.data = n;
    }
  }

