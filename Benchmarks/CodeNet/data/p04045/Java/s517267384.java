import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int k=sc.nextInt();
	 HashSet<Integer> set=new HashSet<>();
	 for(int i=0;i<k;i++)
	 set.add(sc.nextInt());
	 int ans=0;
	 for(int i=n;i<=10000;i++)
	 {
		 String s=""+i;
		 char ar[]=s.toCharArray();
		 int m=0;
		 for(char c:ar)
		 {
			 if(set.contains(Integer.parseInt(""+c)))
			 m++;
		 }
		 if(m==0)
		 {
			 ans=i;
			 break;
		 }
	 }
	 System.out.println(ans);
	}
}
