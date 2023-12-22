import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cases;
		cases = Integer.parseInt(bf.readLine());
		String data = "";
		String[] temp;
		StringBuffer buf = new StringBuffer();
		for(int i=0;i<cases;i++)
		{
			data = bf.readLine();
			if(data.contains("insert"))
			{
				temp = data.split(" ");
				if(buf.toString().length() == 0)
					buf.insert(0, temp[1]);
				else
					buf.insert(0, temp[1] + " ");
			}else if(data.contains("deleteFirst"))
			{
				temp = buf.toString().split(" ");
				buf.delete(0, buf.length());
				for(int j=1;j<temp.length;j++)
				{
					if(j == temp.length-1)
						buf.append(temp[j]);
					else
						buf.append(temp[j] + " ");
				}
			}else if(data.contains("deleteLast"))
			{
				temp = buf.toString().split(" ");
				buf.delete(0, buf.length());
				for(int j=temp.length-2;j>=0;j--)
				{
					if(j == temp.length-2)
						buf.insert(0, temp[j]);
					else
						buf.insert(0, temp[j] + " ");
				}
			}else
			{
				temp = data.split(" ");
				if(buf.toString().contains(temp[1]))
				{
					String testString = temp[1];
					temp = buf.toString().split(" ");
					buf.delete(0, buf.length());
					int count = 0;
					for(int j=0;j<temp.length;j++)
					{
						if(temp[j].equals(testString) && count == 0)
						{
							count++;
							continue;
						}	
						if(j == temp.length-1 || (j == temp.length-2 && temp[j+1].equals(testString) && count == 0))
							buf.append(temp[j]);
						else
							buf.append(temp[j] + " ");
					}
				}
			}
		}
		System.out.println(buf);
	}
}

