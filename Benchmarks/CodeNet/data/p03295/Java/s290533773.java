import java.util.*;
public class Main {


	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nos, queries;
		nos = scan.nextInt();
		
		
		queries = scan.nextInt();
		int a_array[] = new int[queries];
		int b_array[] = new int[queries];
		for( int i= 0; i<queries; i++)
		{
			a_array[i] = scan.nextInt();
			b_array[i] = scan.nextInt();
			
		}
		Arrays.sort(a_array);
		Arrays.sort(b_array);
		int count = 0;
		int b_position = 0;
		for(int i=0; i<queries;i++)
		{
			if(i>0)
				if(a_array[i]==a_array[i-1])
					continue;
			if(a_array[i]>=b_array[b_position] )
			{
				count++;
				if(b_position==0)
					b_position++;
				while(b_array[b_position]==b_array[b_position-1])
					b_position++;
			}
				
		}
		System.out.println(count+1);
		scan.close();
	}

}
