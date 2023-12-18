import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int index=0;
  int ans=0;
  ArrayList<Oder<Integer>> o=new ArrayList<Oder<Integer>>();
  for(int i=0;i<n;i++){
    int a=sc.nextInt();
  	o.add(new Oder<Integer>(sc.nextInt(),a));
  }
  Collections.sort(o,new Comparator<Oder<Integer>>(){
  public int compare(Oder<Integer>a,Oder<Integer>b){
  return a.weight-b.weight;
  }
  
  });
  for(int i=0;i<n;i++){
    ans=o.get(i).weight;
  	index+=o.get(i).cont;
    if(index>=k)break;
  }
  System.out.println(ans);
  
}

}
class Oder<T>{
	public T cont;
	public int weight;
	public Oder(T t) {
		this.cont =t;
	}
	public Oder(T t,int w) {
		cont =t;
		weight=w;
	}
	public String toString() {
		return cont.toString()+":"+weight;
	}
}