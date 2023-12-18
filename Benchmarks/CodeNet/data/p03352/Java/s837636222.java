import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(1);
for(int count=2;count<11;count++){
inner:  for(int i=2;i<=(int)Math.pow(x,0.5);i++){
        if((int)Math.pow(i,count)<=x){
        list.add((int)Math.pow(i,count));
      }else{
        break inner ;
      }
    }
}
Collections.sort(list);

        System.out.print(list.get(list.size()-1));

  }
}
