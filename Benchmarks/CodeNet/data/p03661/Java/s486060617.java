public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int x=arr[0];int y=arr[n-1];
		int r=n-1;
		int l=0;
		if(arr.length==2)
		{
			System.out.println(arr[0]-arr[1]);
			return;
		}
		for (int i = 1; i < arr.length; i++) {		
			if(x<y)
			{
				x+=arr[l];
				l++;
			}
			else
			{
				y+=arr[r];
				r--;
			}
			//System.out.println(x+" " +y);
		}
		
		System.out.println(Math.abs(x-y));
	}

}
