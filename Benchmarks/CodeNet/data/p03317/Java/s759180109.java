import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int counter = sc.nextInt();
    int range = sc.nextInt();
    int[] array = new int[counter];
    int[] ansArray = new int[counter];
    int pibot = 100000;
    
    for(int i = 0;i<counter;i++){
      array[i] = sc.nextInt();
      if(array[i]<pibot) pibot = array[i];
    }
    
    for(int i = 0;i<counter;i++){
      if(array[i] == pibot)
        ansArray[i] = 1;
      else
        ansArray[i] = 0;
    }
    
    int answer = firstOrder(ansArray,pibot,range);
    
    int start = 0;
    while((start = check(ansArray,pibot))<counter){
      order(ansArray,pibot,range,start);
      answer++;
    }
    System.out.println(answer);
  }
  
  public static int firstOrder(int[] array,int pibot,int range){
    for(int i = 0;i<array.length;i++){
      if(array[i] == pibot){
        if(i<range){
          change(array,0,range);
          return 1;
        }else{
          if(i%(range-1)==0){
            change(array,0,i);
            return i/(range-1);
          }else{
            int end = i/(range-1)+1;
            change(array,0,end*(range-1));
            return end;
          }
        }
      }
    }
    return 0;
  }
  
  public static void order(int[] array,int pibot,int range,int start){
    boolean front = true;
    for(int i = 1;i<range&&i+start<array.length;i++){
      if(array[start+i]==1){
        front = false;
        break;
      }
    }
    if(front){
      change(array,start,range);
    }
    else{
      change(array,start+1,range);
    }
  }
  
  public static void change(int[] array,int s,int range){
    for(int i = 0;i<range&&i+s<array.length;i++){
      array[s+i] = 1;
    }
  }
  
  public static int check(int[] array,int pibot){
    int i = 0;
    for(i = 0;i<array.length;i++){
     if(array[i] == 0) return i-1;
    }
    return i;
  }
}