import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		class IndexData
		{
			String word;
			//String page;
			List<Integer> page = new ArrayList<>();
		};
		List<IndexData> list = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext(); )
		{
			String word = scanner.next();
			int page = scanner.nextInt();
			
			boolean is_equals = false;
			for(int i=0; i<list.size(); i++)
			{
				IndexData index = list.get(i);
				if(word.equals(index.word))
				{
					is_equals = true;
					index.page.add(page);
					list.set(i, index);
					break;
				}
			}
			if(!is_equals)
			{
				IndexData index = new IndexData();
				index.word = word;
				index.page.add(page);
				list.add(index);
			}
		}
		
        Collections.sort(
                list,
                new Comparator<IndexData>()
                {
                    @Override
                    public int compare(IndexData obj0, IndexData obj1)
                    {
                        return obj0.word.compareTo(obj1.word);
                    }
                });
        
		for(int i=0; i<list.size(); i++)
		{
			IndexData index = list.get(i);
			System.out.println(index.word);
			
	        Collections.sort(
	                index.page,
	                new Comparator<Integer>()
	                {
	                    @Override
	                    public int compare(Integer obj0, Integer obj1)
	                    {
	                        return (obj0 > obj1) ? 1 : -1;
	                    }
	                });
	        
			for(int j=0; j<index.page.size(); j++)
			{
				System.out.print((j>0?" ":"") + index.page.get(j));
			}
			System.out.println("");
		}
	}
}