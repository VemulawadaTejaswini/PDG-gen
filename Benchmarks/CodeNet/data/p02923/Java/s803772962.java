import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<N;i++){
      list.add(scan.nextInt());
    }
    Collections.reverse(list);
    int count=0;
    int val=0;
    int max=count;
    for(int j=0;j<N-1;j++){
      int p1=list.get(j);
      int p2=list.get(j+1);
      if(p1>p2){
        count=j-val;
        val=j+1;
        if(max<count){
          max=count;
        }
      }
    }
    System.out.println(max);
  }
}