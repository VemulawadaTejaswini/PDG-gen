import java.util.*;

class Man{
  private long money = 1000;
  private long hasStock = 0;
  
  public void buyStock(int price){
    long buys =(long) money / price;
    hasStock += buys;
    money -=(long) buys * price;
  }
  
  public void sellStock(int price){
    money +=(long) hasStock * price;
    hasStock = 0;
  }
  
  public long getMoney(){
    return this.money;
  }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      
      List<Integer> rates = new ArrayList<Integer>();
      for(int i=0;i<N;i++){
        rates.add(sc.nextInt());
      }
      
      Man man = new Man();
      for(int i=0;i<N-1;i++){
        if(rates.get(i) < rates.get(i+1)){
          man.buyStock(rates.get(i));
        } else if(rates.get(i) > rates.get(i+1)){
          man.sellStock(rates.get(i));
        }
      }
      man.sellStock(rates.get(N-1));
      System.out.println(String.valueOf(man.getMoney()));
    }
}