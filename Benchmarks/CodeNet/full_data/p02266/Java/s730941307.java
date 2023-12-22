import java.io.*;
import java.util.*;
class Lake
{
	private int x,area;
	Lake(int x , int area)
	{
		this.x = x;
		this.area = area;
	}
	public int getArea()
	{
		return this.area;
	}
	public int getX()
	{
		return this.x;
	}
}

public class Main
{
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] graph = br.readLine().toCharArray();
		Deque<Integer> down= new ArrayDeque<>();
		Deque<Lake> lakes  = new ArrayDeque<>();
		int sum = 0 ;
		for( int i= 0 ; i< graph.length ; i++)
		{
			if(graph[i] == '\\')
			{
				down.offer(i);		
			}
			else if(!down.isEmpty() && graph[i] =='/')
			{
				int a = i -  down.peekLast();
				sum += a ;
				while(!lakes.isEmpty() && (down.peekLast() < lakes.peekLast().getX()))
				{
					a += lakes.pollLast().getArea();
				}
				lakes.offer(new Lake(down.pollLast() , a ));
			}
		}
		sb.append(sum).append('\n')
		  .append(lakes.size()).append(' ');
			for(Lake l : lakes)
			{
				sb.append(l.getArea()).append(' '); 
			}
			sb.deleteCharAt(sb.length()-1).append('\n');
		System.out.print(sb);
	}
}