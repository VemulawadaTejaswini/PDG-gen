import java.util.Scanner;

class Cell{
  int key;
  Cell prev, next;
  Cell(int key, Cell prev, Cell next){
    this.key = key;
    this.prev = prev;
    this.next = next;
  }
}

class List{
  Cell head;

  List(){
    head = null;
  }

  void insert(int x){
    head = new Cell(x, null, head);
    if(head.next != null)
      head.next.prev = head;
  }

  void delete(int x){
    Cell cell = head;
    while(cell != null){
      if(cell.key == x){
        if(cell.prev == null)
          deleteFirst();
        else if(cell.next == null)
          deleteLast();
        else{
        cell.prev.next = cell.next;
        cell.next.prev = cell.prev;
        }
        break;
      }
      else
        cell = cell.next;
    }
  }

  void deleteFirst(){
    if(head != null)
      head = head.next;
  }

  void deleteLast(){
    Cell cell = head;
    if(cell != null)
      while(cell.next != null)
        cell = cell.next;

    if(cell != null && cell.prev != null)
      cell.prev.next = null;
  }

  void printList(){
    Cell cell = head;
    while(cell.next != null){
      System.out.print(cell.key + " ");
      cell = cell.next;
    }
    System.out.println(cell.key);
  }

}

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    List list = new List();

    for(int i = 0; i < n; i++){
      String order = stdIn.next();
      int x;
      if(order.equals("insert")){
        x = stdIn.nextInt();
        list.insert(x);
      }
      else if(order.equals("delete")){
        x = stdIn.nextInt();
        list.delete(x);
      }
      else if(order.equals("deleteFirst"))
        list.deleteFirst();
      else if(order.equals("deleteLast"))
        list.deleteLast();
    }

    list.printList();

  }
}