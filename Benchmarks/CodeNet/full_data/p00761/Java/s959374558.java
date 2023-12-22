
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner scanner=new Scanner(System.in);
		
		while(true){

		String a=scanner.next();
		int L=scanner.nextInt();

		if(a.equals("0")  && L == 0)
			return;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		PriorityQueue<String> q = new PriorityQueue<String>();
		//PriorityQueue reverse = new PriorityQueue();

//		LinkedList q = new LinkedList();

		
		list.add(Integer.parseInt(a));
		String[] array;

		for(int i=0;i<20;i++)
		{
			array = a.split("");

			for(int j = 0;j<L;j++)
			{
				if(j >= array.length)
				{
					q.add("0");
				}
				else
				{
					q.add(array[j]);
				}
			}


			String max = "";
			String min = "";


			for(int j=0;j<L;j++)
			{
				min += q.poll();
			}

			String min_array[] = min.split("");

			for(int j=L-1;j>=0;j--)
			{
				max += min_array[j];
			}

			//System.out.println(max + ":" + min);
			//System.out.println( Integer.parseInt(max) + ":" + Integer.parseInt(min));

			Integer result  = Integer.parseInt(max) - Integer.parseInt(min);

		//	System.out.print(i);
		//	System.out.print(" "+result);


			if(list.indexOf(result) != -1)
			{

//				System.out.println(list.get(0));
	//			System.out.println(list.get(1));
		//		System.out.println(list.get(2));
			//	System.out.println(list.get(3));



				System.out.print(list.indexOf(result));
				System.out.print(" "+result);
				int kekka = i - +list.indexOf(result)+1 ;
				System.out.print(" "+kekka);
				break;
			}


			list.add(result);

		     a = result.toString();



		}
		
		}

	}



}