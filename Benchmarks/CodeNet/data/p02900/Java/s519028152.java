import java.util.*;



public class Main{
  static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int m = gcd(a,b);
    int count =0;
    ArrayList<Integer> list = new ArrayList<Integer>();

    for(int i=1; i<=m; i++){
      if(m%i==0){
        //count += 1;
        list.add(i);
      }
    }
    //System.out.println(m);
    //System.out.println(count);
    //System.out.println(list);
    int l = list.size();
    //System.out.println(l);

    int p = 0;
    int q = 0;
    for(int i=0; i<l-1; i++){
      p = list.get(i);
      for(int j=i+1; j<l; j++){
        q = list.get(j);
        if(gcd(p,q)==1){
          //System.out.println(p+"_"+q);

          count +=1;
        }
      }
    }
    System.out.println(count);
  }
}