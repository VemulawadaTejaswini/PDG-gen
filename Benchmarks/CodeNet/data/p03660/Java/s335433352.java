import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		int point[]=new int[n+1];
		point[1]=1;
		point[n]=-1;
		ArrayList<LinkedList<Integer>> way=new ArrayList<LinkedList<Integer>>(n+1);
		for(int i=0;i<=n;i++){
			way.add(new LinkedList<Integer>());
		}
		for(int i=1;i<n;i++){
			in.nextToken();
			int a=(int)in.nval;
			in.nextToken();
			int b=(int)in.nval;
			way.get(a).add(b);
			way.get(b).add(a);
		}
		Queue<Integer> q1=new LinkedList<Integer>();
		Queue<Integer> q2=new LinkedList<Integer>();
		q1.offer(1);q2.offer(n);
		Iterator<Integer> it;
		int ans1=0,ans2=0,temp1=1,temp2=1,temp11,temp22,edge;
		while(!q1.isEmpty()||!q2.isEmpty()){
			temp11=0;temp22=0;
			for(int i=0;i<temp1;i++){
				int com=q1.poll();
				it=way.get(com).iterator();
				while(it.hasNext()){
					edge=it.next();
					if(point[edge]==0){
						point[edge]=1;
						q1.add(edge);
						temp11++;
						ans1++;
					}
				}
			}
			temp1=temp11;
			for(int i=0;i<temp2;i++){
				int com=q2.poll();
				it=way.get(com).iterator();
				while(it.hasNext()){
					edge=it.next();
					if(point[edge]==0){
						point[edge]=-1;
						q2.add(edge);
						temp22++;
						ans2++;
					}
				}
			}
			temp2=temp22;
		}
		if(ans1>ans2)out.println("Fennec");
		else out.println("Snuke");
		out.flush();
	}
}