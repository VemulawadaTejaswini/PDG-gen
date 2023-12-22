import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> wordArray = new ArrayList<String>();
		ArrayList<String> dicArray = new ArrayList<String>();
		ArrayList<Integer> dicCount = new ArrayList<Integer>();
		
		while(true)
		{
			//入力
			int n = Integer.valueOf(sc.nextLine());
			if(n==0)
				break;
			wordArray.clear();
			dicArray.clear();
			dicCount.clear();
			for(int i=0;i<n;i++)
			{
				String word = sc.nextLine();
				String[] wordSplit = word.split(" ");
				for(int j=0;j<wordSplit.length;j++)
				{
					wordArray.add(wordSplit[j]);
				}
			}
			Collections.sort(wordArray);
			
			//検索
			String k = sc.nextLine();
			String tmp = "";
			int count = 1,maxCount = -1;
			for(int i=0;i<wordArray.size();i++)
			{
				if(wordArray.get(i).charAt(0)==k.charAt(0))
				{
					if(tmp.equals(wordArray.get(i)))
					{
						count++;
						dicCount.set(dicCount.size()-1,count);
						if(maxCount<count)
							maxCount=count;
					}
					else
					{
						tmp = wordArray.get(i);
						dicArray.add(tmp);
						dicCount.add(1);
						count = 1;
						maxCount = 1;
					}
				}
				
			}
			//出力
			int flg=0;
			for(int i=0;i<5;i++)
			{
				int index = dicCount.indexOf(maxCount);
				if(index!=-1)
				{
					System.out.println(dicArray.get(index));
					dicArray.remove(index);
					dicCount.remove(index);
					flg=1;
				}
				else
					maxCount--;
				if(maxCount<0)
					break;
			}
			if(flg==0)
				System.out.println("NA");

		}
	}

}