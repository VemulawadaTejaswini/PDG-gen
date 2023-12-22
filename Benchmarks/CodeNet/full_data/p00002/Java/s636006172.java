import java.util.*;
public class Main {
	public static void main(String[] agrs){
		Scanner x=new Scanner(System.in);
		
		int a []=new int[6];
		for(int i=0;i<3;i++){
			String str =x.nextLine();
			String[] s = str.split(" ");
			a[i] = Integer.parseInt(s[0]);
			a[5-i] = Integer.parseInt(s[1]);
		}
		x.close();
 for(int i=0;i<3;i++){
	 int n=(a[i]+a[5-i]);
	 int sum=0;
	 while(n!=0){
		 n/=10;
		 sum++;
	 }
	 System.out.println(sum);
 
 }
	}
}