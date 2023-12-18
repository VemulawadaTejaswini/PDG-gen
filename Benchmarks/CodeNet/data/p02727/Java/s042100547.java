

import java.util.*;
public class Main
{
	static Hashtable<String,Integer>hash=new Hashtable<>();
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  String a[]=sc.nextLine().split(" ");
  int x=Integer.parseInt(a[0]);
  int y=Integer.parseInt(a[1]);
  String b[]=sc.nextLine().split(" ");
  String c[]=sc.nextLine().split(" ");
  String d[]=sc.nextLine().split(" ");
  int aa[]=new int[b.length];
  int bb[]=new int[c.length];
  int cc[]=new int[d.length];
  for(int i=0;i<aa.length;i++){aa[i]=Integer.parseInt(b[i]);}
  	for(int i=0;i<bb.length;i++){bb[i]=Integer.parseInt(c[i]);}
  		for(int i=0;i<cc.length;i++){cc[i]=Integer.parseInt(d[i]);}
  	Arrays.sort(aa);
  Arrays.sort(bb);
  Arrays.sort(cc);
  System.out.println(dp(aa,bb,cc,x,y,aa.length-1,bb.length-1,cc.length-1));
  }
  static int dp(int a[], int b[], int c[],int x,int y, int i,int j, int k)
  {
  	if(x==0 && y==0){return 0;}
  	String s=x+" "+y+" "+i+" "+j+" "+k; 
  	if(hash.containsKey(s))
  	{
  		return hash.get(s);
  	}
  		int max=0;
  	
  	if(x>0 && y>0)
  	{
  	
  		if(i!=-1 && j!=-1 && k!=-1){max=max1(a[i]+b[j]+dp(a,b,c,x-1,y-1,i-1,j-1,k),a[i]+c[k]+dp(a,b,c,x-1,y-1,i-1,j,k-1), c[k]+b[j]+dp(a,b,c,x-1,y-1,i,j-1,k-1));}
  		else if(i!=-1 && j!=-1){max=a[i]+b[j]+dp(a,b,c,x-1,y-1,i-1,j-1,k);}
  		else if(i!=-1){max=a[i]+c[k]+dp(a,b,c,x-1,y-1,i-1,j,k-1);}
  		else if(j!=-1){max=b[j]+c[k]+dp(a,b,c,x-1,y-1,i,j-1,k-1);}

  	}
  else if(x>0){
  	if(i!=-1 && k!=-1){max=Math.max(c[k]+dp(a,b,c,x-1,y,i,j,k-1),a[i]+dp(a,b,c,x-1,y,i-1,j,k));}
  		else if(i!=-1){max=a[i]+dp(a,b,c,x-1,y,i-1,j,k);}
  		else{max=c[k]+dp(a,b,c,x-1,y,i,j,k-1);}
  }
  	else 
  	{
  		if(j!=-1 && k!=-1){max=Math.max(c[k]+dp(a,b,c,x,y-1,i,j,k-1),b[j]+dp(a,b,c,x,y-1,i,j-1,k));}
  			else if(j!=-1){max=b[j]+dp(a,b,c,x,y-1,i,j-1,k);}
  			else{max=c[k]+dp(a,b,c,x,y-1,i,j,k-1);}
  	}
  	hash.put(s,max);
  return max;


  }
  static  int max1(int a,int b,int c)
  {
  	return Math.max(Math.max(a,b),c);
  }
}
