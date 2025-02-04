import java.util.*;
import java.lang.Integer;

class Main{
  public static void main(String args[])throws Exception{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ControlList doubly_list = new ControlList();
    for(int i = 0 ; i<n; i++){
      String [] s = sc.nextLine().split("\\s+");
      if(s[0].equals("insert")){
        doubly_list.insert(Integer.valueOf(s[1]));
      }else if(s[0].equals("delete")){
        doubly_list.delete(Integer.valueOf(s[1]));
      }else if(s[0].equals("deleteFirst")){
        doubly_list.deleteFirst();
      }else{
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
    dummy.setnext(dummy);
    dummy.setprevious(dummy);
  }
  //insert
  public void insert(int n){
    List list = new List(n);
    list.setnext(dummy.getnext());
    dummy.getnext().setprevious(list);
    dummy.setnext(list);
    list.setprevious(dummy);
  }
  //ノードの削除メソッド
  public void deleteNode(List delete){
    if( delete == dummy)return;
    delete.getprevious().setnext(delete.getnext());
    delete.getnext().setprevious(delete.getprevious());
  }
  //指定したノードの削除
  public void delete(int n){
    deleteNode(listSearch(n));
  }
  //firstnode削除
  public void deleteFirst(){
    deleteNode(dummy.getnext());
  }
  //lastnode削除
  public void deleteLast(){
    deleteNode(dummy.getprevious());
  }
  //keyを使ってノードを探索
  public List listSearch(int n){
    List cur = dummy.getnext();
    while(cur.getdata()!=n && cur!=dummy){
      cur = cur.getnext();
    }
    return cur;
  }
  //printメソッド
  public void Print_list(){
    List list = dummy.getnext();
    if(list != dummy){
      System.out.printf("%d",list.getdata());
      list = list.getnext();
    }
    while(list!=dummy){
      System.out.printf(" %d",list.getdata());
      list = list.getnext();
    }
    System.out.println();
  }
}


//listの構造体的役割
class List{
  private short data;
  private List next;
  private List previous;

  public List(){
  }

  public List(int n){
    this.data = (short)n;
  }

  public List getnext(){
    return this.next;
  }

  public void setnext(List n){
    this.next = n;
  }

  public List getprevious(){
    return previous;
  }

  public void setprevious(List p){
    this.previous = p;
  }

  public int getdata(){
    return data;
  }
}

