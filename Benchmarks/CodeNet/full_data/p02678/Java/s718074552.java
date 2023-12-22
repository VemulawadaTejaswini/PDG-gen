import java.util.*;
public class Main{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rooms,ways;
	rooms=sc.nextInt();
	ways=sc.nextInt();
	List <Integer> v[]=new ArrayList[rooms+1];
	for(int i=0;i<rooms+1;i+=1) {
		v[i]=new ArrayList<>();
	}
	int c[]=new int[rooms+1];
	int d[]=new int[rooms+1];
	c[0]=0;
	c[1]=0;
	for(int i=2;i<rooms+1;i+=1)
		c[i]=200001;
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
			else if(c[j]==c[i]+1) {
				d[j]=Math.min(d[j], i);
			}
			   
		}
	}
	if(v[1].size()==0) {
		System.out.println("No");
	}
	else
		System.out.println("Yes");
	for(int i=2;i<rooms+1;i+=1)
		System.out.println(d[i]);
	//System.out.println(v[i]);}
}}