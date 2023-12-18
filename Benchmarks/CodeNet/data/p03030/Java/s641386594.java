import java.util.*;
 class Emp{
	String name;
	int score;
	int ind;
	Emp(String n,int s,int i){
		this.name=n;
		this.score=s;
		this.ind=i;
	}
	int getScore(){
		return this.score;
	}
}
      class MyName implements Comparator<Emp>{
		 public int compare(Emp e1,Emp e2){
			 return e2.name.compareTo(e1.name);
		 }
	  }
	  class MyScore implements Comparator<Emp>{
		  public int compare(Emp e1,Emp e2){
			  if(e1.name.compareTo(e2.name)==0&&e1.getScore()<e2.getScore())
				  return 1;
			  else return -1;
		  }
	  }
	  public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		ArrayList<Emp> al=new ArrayList<>();
		for(int i=0;i<a;i++)  
		al.add(new Emp(sc.next(),sc.nextInt(),i+1));
	Collections.sort(al,new MyName());
	Collections.sort(al,new MyScore());
	for(Emp e:al)
		System.out.println(e.ind);
	}
	
}