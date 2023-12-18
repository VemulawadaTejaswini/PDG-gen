import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    List<Rest> l=new ArrayList<>(n);
    for(int i=1;i<=n;i++){
      l.add(new Rest(i,sc.next(),sc.nextInt()));
    }
    Collections.sort(l);
    for(int i=0;i<n;i++){
      System.out.println(l.get(i));
    }
  }
  static class Rest implements Comparable{
    int num;
    String city;
    int point;
    Rest(int n,String s,int p){
      num=n;
      city=s;
      point=p;
    }
    public int compareTo(Object o){
      if(city.compareTo(((Rest)o).city)!=0){
        return city.compareTo(((Rest)o).city);
      }
      return ((Rest)o).point-point;
    }
    public boolean equals(Object o){
      return num==((Rest)o).num;
    }
    public String toString(){
      return String.valueOf(num);
    }
  }
}