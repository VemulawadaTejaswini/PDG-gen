import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int islands = sc.nextInt();
    int counter = sc.nextInt();
    ArrayList<Bridge> list = new ArrayList<>();
    list.add(new Bridge(sc.nextInt(),sc.nextInt()));
    
    for(int i = 0;i<counter-1;i++){
      int front = sc.nextInt();
      int rear = sc.nextInt();
      boolean make = true;
      for(int k = 0;k<list.size();k++){
        if(list.get(k).getFront()>= rear
           ||list.get(k).getRear() <= front){
          continue;
        }else{
          make = false;
          if(front > list.get(k).getFront()){
            list.get(k).setFront(front);
          }
          if(rear < list.get(k).getRear()){
            list.get(k).setRear(rear);
          }
        }
      }
      if(make) list.add(new Bridge(front,rear));
    }
    System.out.println(list.size());
  }
}

class Bridge{
  private int front;
  private int rear;
  
  public Bridge(int font,int rear){
    this.front = front;
    this.rear = rear;
  }
  
  public void setFront(int front){
    this.front = front;
  }
  
  public void setRear(int rear){
    this.rear = rear;
  }
  
  public int getFront(){
    return this.front;
  }
  
  public int getRear(){
    return this.rear;
  }
}