import java.io.BufferedReader;
import java.io.InputStreamReader;

class Volume0009 {

	public static void main(String[] args) {
	    try
	    {
	    	String str = null;
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    while(true)
		    {
			    str = br.readLine();
			    if(str != null)
			    {
					int n = Integer.parseInt(str);
					int count = 0;
					for(int i = 2; i <= n; i++ )
					{
						double max = Math.sqrt(i);
						boolean isPrime = true;
						for(int j = 2; j <= max; j++)
						{
							int s = i % j;
							if(s == 0)
							{
								isPrime = false;
								break;
							}
							else
							{
								isPrime = true;
							}
						}

						if(isPrime)
						{
							count++;
						}
					}

					System.out.println(count);
			    }
		    }

	    }catch(Exception ex)
	    {
	    }
	}
}