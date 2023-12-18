import java.util.*;
class Pair{
 public long a;
 public long b;
 Pair(long a,long b){
 this.a=a;
 this.b=b;
 }
 public String toString(){
	 return this.a+"::"+this.b;
 }
}
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	    long b=sc.nextLong();
	    long arr[]=new long[a];
		for(int i=0;i<a;i++)
			arr[i]=sc.nextLong();
		Arrays.sort(arr);
		ArrayList<Pair> al=new ArrayList<>();
		for(int i=0;i<b;i++)
			al.add(new Pair(sc.nextLong(),sc.nextLong()));
	     Collections.sort(al,new Comparator<Pair>(){
			 @Override
			public int compare(Pair a,Pair b){
				if(a.b==b.b)
					return (int)(b.a-a.a);
					else return (int)(b.b-a.b);
			}
		}
		);
		int k=0;
		for(int i=0;i<b;i++){
			for(int j=0;j<al.get(i).a;j++){
				if(k<a&&al.get(i).b>arr[k])
				{
					arr[k]=al.get(i).b;
					k++;
				}
				else break;
			}
			if(k >= a || al.get(i).b<arr[k])
				break;
		}
		long s=0;
		for(int i=0;i<a;i++){
			s+=arr[i];
		}
			System.out.println(s);
	}
}