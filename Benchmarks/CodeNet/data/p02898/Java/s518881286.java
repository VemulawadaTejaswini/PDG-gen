
https://atcoder.jp/contests/abc142/tasks/abc142_b
XMA Header Image
B - Roller Coaster
atcoder.jp
ايه يستا
انت نمت

import java.util.Scanner;
 class Main {  
				public static void main(String[] args) {
				Scanner reader =new Scanner (System.in);
				int arr[]=new int [101010];
				int k;
			   int n;
			   int cnt=0;
			   n=reader.nextInt();
			   k=reader.nextInt();
			   for(int i=0;i<n;i++)
			   {
				   arr[i]=reader.nextInt();
			   }
			   for(int i=0;i<n;i++)
			   {
				   if(arr[i]>=k)
				   {
					   cnt++;
				   }
			   }
			   System.out.println(cnt);
			}
	}