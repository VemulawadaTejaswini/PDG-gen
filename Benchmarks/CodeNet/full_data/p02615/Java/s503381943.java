import java.util.*;

class MyComparator implements Comparator {
 
    public int compare(Object obj1, Object obj2) {
         
        int num1 = (int)obj1;
        int num2 = (int)obj2;
         
        if(num1 < num2) {
            return 1;
        } else if(num1 > num2) {
            return -1;
        } else{
            return 0;
        }
    }
}
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int[] cofor=new int[num];
    Queue con= new PriorityQueue(num,new MyComparator());
    for(int a=0; a<num; a++){
      con.add(scan.nextInt());
    }
    int add1=0;
    int add2=0;;
    int tmp=0;
    int i=0;
    int ans=0;
    while(i<num){
      tmp=(int)con.poll();
      if(add1>add2 && add2!=0){
        ans+=add2;
      }else{
        ans+=add1;
      }
      add2=add1;
      add1=tmp;
      i++;
    }
    System.out.println(ans);
  }
}