import java.util.LinkedList;
import java.util.Scanner;



public class Main{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		LinkedList<String> qName = new LinkedList<>();
		LinkedList<Integer> qTime = new LinkedList<>();
		
		int amount = in.nextInt();
		int quantum = in.nextInt();
		for(int i= 0; i < amount; i++) 
		{
			qName.addLast(in.next());
			qTime.addLast(in.nextInt());
		}

		int time = 0;
		while(qName.size() != 0)
		{
			String cName = qName.removeFirst();
			int cTime = qTime.removeFirst();
			if(cTime > quantum)
			{
				time = time + quantum;
				cTime = cTime - quantum;
				
				qName.addLast(cName);
				qTime.addLast(cTime);
			}else
			{
				time = time + cTime;
				System.out.println(cName + " " + time);
			}
		}
	}

	
}
