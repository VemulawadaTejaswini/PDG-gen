import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\n");
		String str1 = scan.next();
		char[] question = str1.toCharArray();
		String str2;
		char[] box;
		int count = 0;
		int j;
		int k;
		do{
			str2 = scan.next();
		}while(scan.hasNext());
		box = str2.toCharArray();
		for(int i = 0;i < box.length;i++)
		{
			if(Character.isUpperCase(box[i])){
				box[i] = Character.toLowerCase(box[i]);
			}
		}
		
		for(int i = 0;i < box.length;i++)
		{
			if(question[0] == box[i])
			{
				j = 1;
			 	k = i + 1;
				while(j < question.length && question[j] == box[k])
				{
					j++;
					k++;
				}
				if(j == question.length - 1)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}