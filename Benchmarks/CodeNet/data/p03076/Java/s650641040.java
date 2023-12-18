import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> a=new ArrayList<Integer>();
    for(int i=0;i<5;i++){
      a.add(new Integer(sc.nextInt()));
    }
    int k=10,point=0,sum=0;
    for(int i=0;i<5;i++){
      for(int j=0;j<5-i;j++){
        if(((a.get(j)/10)+1)*10-a.get(j)<k){
          k=((a.get(j)/10)+1)*10-a.get(j);
          point=j;
        }
      
    }
    if(i<4){
        sum+=((a.get(point)/10)+1)*10;
        a.remove(point);
        k=10;
          }else{
            sum+=a.get(point);
          }
  }
  System.out.print(sum);
}
}