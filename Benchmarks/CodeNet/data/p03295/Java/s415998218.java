import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int islands = sc.nextInt();
    int counter = sc.nextInt();
    
    int[][] bridge = new int[counter][2];
    int front = sc.nextInt();
    int rear = sc.nextInt();
    
    bridge[0][0] = front;
    bridge[0][1] = rear;
    
    for(int i = 0;i<counter-1;i++){
      front = sc.nextInt();
      rear = sc.nextInt();
      int j;      
      boolean newMake = true;
      
      for(j = 0;bridge[j][1] != 0;j++){
        if(bridge[j][0] >= rear
           || bridge[j][1] <=front){
          continue;
        }else{
          newMake = false;
          if(bridge[j][0] < front){
            bridge[j][0] = front;
          }
          if(bridge[j][1] > rear){
            bridge[j][1] = rear;
          }
          break;
        }
      }
      if(newMake){
        bridge[j][0] = front;
        bridge[j][1] = rear;
      }
    }
    int i;
    for(i=0;bridge[i][0] != 0;i++);
    System.out.println(i);
  }
}