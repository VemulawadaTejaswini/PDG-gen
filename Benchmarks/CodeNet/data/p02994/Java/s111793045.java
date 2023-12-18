import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[]=new int[a];
		int c=0;
		for(int i=0;i<a;i++){
			arr[i]=b+i;
			if(arr[i]>=0)
				c++;
			else c--;
		}
		int s=0;
		if(c==a){
			for(int i=1;i<a;i++)
				s=s+arr[i];
		}
		else if(c==-a){
		for(int i=0;i<a-1;i++)
			s+=arr[i];
		}
        else {
			for(int i=0;i<a;i++){
				if(i==a/2)
					continue;
				s+=arr[i];
		}
		}		
		System.out.println(s);
	}
}