import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 long m=s.nextLong();
	 int v=s.nextInt();
	 int p=s.nextInt();
	 long a[]=new long[n];
	 HashSet<Long>hs=new HashSet<Long>();
	 HashMap<Long,Integer>hm=new HashMap<>();
	 for(int i=0;i<n;i++)
	 {a[i]=s.nextLong();hs.add(a[i]);
	     if(hm.containsKey(a[i]))
	     {int tt=hm.get(a[i]);
	     tt++;
	     hm.replace(a[i],tt);}
	     else
	     {hm.put(a[i],1);}
	 }
	 int l=hs.size();
	 long b[]=new long[l];
	 Iterator<Long>it=hs.iterator();
	 int j=0;
	 while(it.hasNext())
	 {b[j]=it.next();j++;}
	 Arrays.sort(b);
	 int ans=0;
	 long kk=m*v;
	 for(int i=1;i<p;i++)
	 {long k=b[l-1-i];
	 int vvv=hm.get(k-1);
	 if(vvv==0)
	 {}
	 else
	 {if(vvv>kk)
	 {int vv=hm.get(k);
	 vv=vv+(int)kk;
	 hm.replace(k,vv);
	 hm.replace(k-1,vvv-(int)kk);
	     kk=0;}
	 else
	 {int vv=hm.get(k);
	 vv=vv+vvv;
	 kk=kk-vvv;
	 hm.replace(k,vv);
	 hm.replace(k-1,0);}}}
	 j=l-1;
	 for(int i=0;i<p;i++)
	 {int kkk=hm.get(b[j]);
	     if(kkk==0)
	     {i--;}
	     ans=ans+kkk;j--;}
	 System.out.println(ans);}}