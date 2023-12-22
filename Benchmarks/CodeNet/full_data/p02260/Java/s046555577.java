import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int b[]=new int [a];
		for(int i=0;i<a;i++){
			b[i]=x.nextInt();
		}
		int c;
		int d=0;
		for(int i=0;i<a;i++){
			for(int j=i+1;j<a;j++){
				if(b[i]>b[j]){
					c=b[i];
					b[i]=b[j];
					b[j]=c;
					d++;
				}
				else{
					i++;
				}
			}
		}
		int w;
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				if(b[i]>b[j]&&i!=j)
				{
					w=b[i];
					b[i]=b[j];
					b[j]=w;
				}
			}
		}
		for(int i=a-1;i>=0;i--){
			System.out.print(b[i]);
			if(i!=0)
				System.out.print(" ");
		}
		System.out.println();
		System.out.print(d);
	}
}
