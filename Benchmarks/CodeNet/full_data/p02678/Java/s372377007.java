import java.util.*;
public class Main{
	static List <Integer> v[]=new ArrayList[100001];
	static int c[]=new int[200001];
	static int d[]=new int[200001];
static boolean check(int rooms) {
	for(int i=0;i<rooms;i+=1) {
		if(d[i]==200001||c[i]==200001)
			return false;
	}
	return true;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rooms,ways;
	rooms=sc.nextInt();
	ways=sc.nextInt();
	for(int i=0;i<rooms+1;i+=1) {
		v[i]=new ArrayList<>();
	}
	c[0]=0;
	c[1]=0;
	for(int i=2;i<rooms+1;i+=1)
		{c[i]=200001; d[i]=200001;}
	int a,b;
	for(int i=0;i<ways;i+=1) {
		a=sc.nextInt();
		b=sc.nextInt();
		v[a].add(b);
		v[b].add(a);
	}
	for(int i=1;i<rooms+1;i+=1) {
		for(int j:v[i])
		{
			if(c[j]>c[i]+1)
				{c[j]=c[i]+1; d[j]=i;}
			}
			   
		}
	if(v[1].size()==0||check(rooms)==false) {
		System.out.println("No");
	}
	else
		System.out.println("Yes");
	for(int i=2;i<rooms+1;i+=1)
		System.out.println(d[i]);
	sc.close();}}