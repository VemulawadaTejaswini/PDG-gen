import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		class Data
		{
			int id;
			int score;
		}
		ArrayList<Data> data = new ArrayList<>();
		
		for(; ;)
		{
			String[] input = scanner.next().split(",");
			
			int id = Integer.parseInt(input[0]);
			int score = Integer.parseInt(input[1]);
			if(id==0 && score==0)
			{
				break;
			}
			
			Data d = new Data();
			d.id = id;
			d.score = score;
			data.add(d);
		}
		
        Collections.sort(
                data,
                new Comparator<Data>()
                {
                    @Override
                    public int compare(Data o1, Data o2)
                    {
                        return o1.score>o2.score ? -1: 1;
                    }
                });
		
		for(; scanner.hasNext();)
		{
			int id = Integer.parseInt(scanner.next());
			int lank = 1;
			for(int i=0; i<data.size(); i++)
			{
				if(id == data.get(i).id)
				{
					System.out.println(lank);
					break;
				}
				if(i < data.size()-1)
				{
					if(data.get(i).score > data.get(i+1).score)
					{
						lank ++;
					}
				}
			}
		}
		
	}
}