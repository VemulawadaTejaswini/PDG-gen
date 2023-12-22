public class Main
{
	public static void main(String arg[])
    {
    	int arr[] = new int[5];
      	int i = 0;
      	Scanner scan = new Scanner(System.in);
      	for(i =0; i < arr.length(); i++)
        {
        	arr[i] = scan.nextInt();
        }
      
      for(int j = 0; j < arr.length(); j++)
      {
      	if(arr[i] == 0)
        {
        	System.out.println(i);
        }
      }
    }
}