import java.util.*;

public class Main{
  static int cost = 0;
  private int a;
  private int b;

  Energy_Drink_Collector(int a, int b){
    this.a = a;
    this.b = b;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    Energy_Drink_Collector[] d = new Energy_Drink_Collector[n];

    for(int i=0; i<n; i++){
      d[i] = new Energy_Drink_Collector(sc.nextInt(),sc.nextInt());
    }
    //for(int i=0; i<n; i++){
      //System.out.println(d[i].a+","+d[i].b);
    //}
    Arrays.sort(d,new Comparator<Energy_Drink_Collector>(){
      public int compare(Energy_Drink_Collector o1,Energy_Drink_Collector o2){
        return o1.a - o2.a;
      }
    });
    //for(int i=0; i<n; i++){
      //System.out.println(d[i].a+","+d[i].b);
    //}
    int j = 0;
    while(m>0){
      if(m-d[j].b>=0){
        cost += d[j].a * d[j].b;
        m -=  d[j].b;
      }else if(m-d[j].b<0){
        cost += d[j].a * m;
        m = 0;
      }
      j++;
      //System.out.println("rest ;"+m);
      System.out.println("cost :"+cost);
    }



  }