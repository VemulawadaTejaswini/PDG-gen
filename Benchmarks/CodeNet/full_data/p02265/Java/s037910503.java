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
  Cell tail;

  List(){
    this.head = null;
    this.tail = null;
  }

  void printList(){
    Cell c = head;
    while(c != null){
      if(c == tail)
        System.out.println(c.key);
      else
        System.out.print(c.key + " ");

      c = c.next;
    }
  }

  void insert(int x){
    head = new Cell(x, null, head);
    if(tail == null)
      tail = head;
    else
      head.next.prev = head;
  }

  boolean delete(int x){
    Cell c = head;
    while(c != null){
      if(c.key == x){
        if(c == head){
          deleteFirst();
          return true;
        }
        else if(c == tail){
          deleteLast();
          return true;
        }
        else{
          c.prev.next = c.next;
          c.next.prev = c.prev;
          return true;
        }
      }
      c = c.next;
    }
    return false;
  }

  void deleteFirst(){
    head = head.next;
    if(head == null)
      tail = null;
    else
      head.prev = null;
  }

  void deleteLast(){
    tail = tail.prev;
    if(tail == null)
      head = null;
    else
      tail.next = null;
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
      if(order.charAt(0) == 'i'){
        x = stdIn.nextInt();
        list.insert(x);
      }
      else if(order.length() > 6 && order.charAt(6) == 'F')
        list.deleteFirst();
      else if(order.length() > 6 && order.charAt(6) == 'L')
        list.deleteLast();
      else{
        x = stdIn.nextInt();
        list.delete(x);
      }
    }

    list.printList();

  }
}