import java.util.*;
class Date{

  int a;
  int n;
  public Date(int a,int n){
    this.a = a; this.n = n;
  }
}
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    ArrayList<Date> al = new ArrayList<>();
    for(int i = 0;i < a.length;i++){
      if(i < n/2){
        al.add(new Date(scan.nextInt(),i*2+1));
      }else if(i == a.length-1){
        al.add(new Date(scan.nextInt(),2));
      }
      else{
        al.add(new Date(scan.nextInt(),(n-i-1)*2+1));
      }
    }
    al.sort((c,d)-> c.a - d.a );
    long m = (n*(n+1))/2;
    m = (m/2)+1;
    int kosuu = 0;
    for(int i = 0;i < a.length;i++){
      int k = al.get(i).n;
      if(kosuu+k>=m){
        System.out.println(al.get(i).a);
        break;
      }else{
        kosuu += k;
      }
    }
  }
}