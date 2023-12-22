import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\n");
		String str1 = scan.next();
		char[] box = str1.toCharArray();
		String str2 = "abcdefghijklmnopqrstuvwxyz";
		char[] az = str2.toCharArray();
		int[] ans = new int[26];
		
		for(int i = 0;i < box.length;i++)
		{
			if(Character.isUpperCase(box[i])){
				box[i] = Character.toLowerCase(box[i]);
			}
			
			for(int j = 0;j < 26;j++)
			{
				if(box[i] == az[j])
				{
					ans[j]++;
				}
			}
		}
		
		for(int i = 0;i < 26;i++)
		{
			System.out.println(az[i] + " : " + ans[i]);
		}
	}
}