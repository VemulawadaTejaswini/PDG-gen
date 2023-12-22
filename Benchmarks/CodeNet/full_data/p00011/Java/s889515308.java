import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] m=new int[n];
		for(int i=0;i<n;i++)m[i]=i;
		int b=s.nextInt();
		for(int i=0;i<b;i++){
            String[] str=s.next().split(",");
            int q=Integer.parseInt(str[0])-1;
            int w=Integer.parseInt(str[1])-1;
			int temp=m[q];
			m[q]=m[w];
			m[w]=temp;
		}
		for(int i=0;i<n;i++)System.out.println(m[i]+1);
	}
}