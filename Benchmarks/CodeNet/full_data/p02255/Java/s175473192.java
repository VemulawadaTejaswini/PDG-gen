import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner x=new Scanner (System.in);
		int a=x.nextInt();
		int a1[]=new int [a];
		for(int i=0;i<a;i++){
			a1[i]=x.nextInt();
		}
		for(int i=1;i<a1.length;i++){
			int key=a1[i];
			int j=i-1;
			while(j>=0&&a1[j]>key){
				a1[j+1]=a1[j];
				j--;
				a1[j+1]=key;
			}
			int d=0;
			for(int w=0;w<a1.length;w++){
				System.out.print(a1[w]);
				if(d!=0||d<a1.length)
					System.out.print(" ");
				d++;
				if(d==6){
					System.out.println();
					d=0;
				}
			}
		}
	}
}
