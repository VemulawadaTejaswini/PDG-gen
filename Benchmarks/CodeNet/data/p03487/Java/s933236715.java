import java.util.*;

class Main {
  	public static void main(String[] args) 
	{
    	Scanner sc = new Scanner(System.in);
		LinkedList<Integer> key = new LinkedList<Integer>();
		LinkedList<Integer> value = new LinkedList<Integer>();

		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int temp = sc.nextInt();

			if(key.contains(temp))
				value.set(key.indexOf(temp), value.get(key.indexOf(temp)) + 1);
			else
			{
				key.add(temp);
				value.add(1);
			}
		}

		int count = 0;
		for(int i = 0; i < key.size(); i++)
		{
			if(key.get(i) > value.get(i))
				count += value.get(i);
			else
				count += value.get(i) - key.get(i);
		}

		System.out.println(count);
  	}
}