import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String a[]=new String[n];
for(int i=0;i<n;i++)
{
String g=sc.next();
char c1[]=g.toCharArray();
Arrays.sort(c1);
String b=String .valueOf(c1);
a[i]=b;
}
int c=0;
HashMap<String,Integer> h = new HashMap<>();
for(String x:a)
{
if(h.containsKey(x))
{h.put(x,h.get(x)+1);
if(h.get(x)>1)
c=c+h.get(x)-1;
}
else
h.put(x,1);
} 
/*for (Map.Entry<String, Integer> val : h.entrySet()) { 
   if(val.getValue()>1)
	c=c+val.getValue(); 
        } 
if(c==0)
System.out.print(0);
else*/
System.out.print(c);

}
}