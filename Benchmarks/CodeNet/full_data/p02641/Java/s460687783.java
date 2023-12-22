import java.util.*;

class Forbit{
  int p = 0;
  int diff = 0;
  
  public Forbit(int i,int x){
    this.p = i;
    
    if(x-i >=0){
      this.diff = x-i;
    } else {
      this.diff = i-x;
    }
  }
  
  public int getP(){
    return this.p;
  }
  
  public int getDiff(){
    return this.diff;
  }
  
  public boolean judge(int x){
    return this.diff != x;
  }
}

class MyComp implements Comparator<Forbit> {
    @Override
    public int compare(Forbit c1, Forbit c2) {
        if(c1.getDiff() == c2.getDiff()){
            return (c1.getP() - c2.getP());
        } else {
            return (c1.getDiff() - c2.getDiff());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
      	if(N==0){
          System.out.println(String.valueOf(X));
          return;
        }
      
        List<Forbit> forbits = new ArrayList<Forbit>();
        for(int i=0;i<N;i++){
          Forbit f = new Forbit(sc.nextInt(),X);
          forbits.add(f);
        }
      
        Collections.sort(forbits, new MyComp());
      
        if(forbits.get(0).judge(0)){
          System.out.println(String.valueOf(X));
          return;
        }
        for(int i=1;i<=N/2;i++){
          if(forbits.get(2*i-1).judge(i)){
            System.out.println(String.valueOf(X-i));
            return;
          } else if(forbits.size()>2*i &&forbits.get(2*i).judge(i)){
            System.out.println(String.valueOf(X+i));
            return;
          }
        }
      
      if(N%2 ==0){
        System.out.println(String.valueOf(X+((int)N/2)));
      } else {
        System.out.println(String.valueOf(X-((int)N/2)-1));
      }
    }
}