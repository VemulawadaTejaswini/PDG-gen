import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]){
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    String str;
    String[] array=new String[2];
    int num;

    LinkedList list=new LinkedList();
    try{
      int n=Integer.parseInt(reader.readLine());
      num=-1;

      for(int i=0;i<n;i++){
        str=reader.readLine();
        if(str.charAt(0)=='i'){
          array=str.split(" ");
          num=Integer.parseInt(array[1]);
          list.insert(num);
        }else if(str.charAt(6)=='F'){
          list.deleteFirst();
        }else if(str.charAt(6)=='L'){
          list.deleteLast();
        }else{
          array=str.split(" ");
          num=Integer.parseInt(array[1]);
          list.delete(num);
        }
      }
      list.outputAll();
    }catch(IOException e){
      ;
    }
  }//main
}

class LinkedList{
  static class Node{
    int data;
    Node prev;
    Node next;

    Node(int data, Node prev, Node next){
      this.data=data;
      this.prev=prev;
      this.next=next;
    }
  }

  Node ptr, head, tail;

  LinkedList(){
    ptr=head=tail=null;
  }

  void insert(int num){
    ptr=head;
    head=new Node(num, null, ptr);
    if(ptr==null)tail=head;//????????????tail????????§????¨????
    if(ptr!=null){
      ptr.prev=head;
    }

  }

  void delete(int num){
    ptr=head;
    if(head.next==null&&ptr.data==num)head=null;
    else{

    while(ptr.data!=num){
    	if(ptr.next==null)break;//?????¨?????????
    	else ptr=ptr.next;//?????¨????????????????????????
    	}

       if(ptr.data!=num);//?????¨?????????????????°???????????????
       else if(ptr.prev==null){
          deleteFirst();
        }else if(ptr.next==null){
          deleteLast();
        }else{
          Node Prev=ptr.prev;
          Node Next=ptr.next;
          Prev.next=ptr.next;
          Next.prev=ptr.prev;
        }ptr=head;
    }
  }

  void deleteFirst(){
    if(head.next==null){
      head=null; //???????????????????????¨????????\??????
    }else{
      head=head.next;
      head.prev=null;
    }
  }

  void deleteLast(){
    ptr=head;
    if(head.next==null){
      head=null; //?????????????????????????????\??????
    }else{
    	ptr=tail.prev;
    	ptr.next=null;
    	tail.prev=null;
    	tail=ptr;
    }
  }

  void outputAll(){
    ptr=head;
    while(ptr.next!=null){
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
    System.out.println(ptr.data);
  }
}