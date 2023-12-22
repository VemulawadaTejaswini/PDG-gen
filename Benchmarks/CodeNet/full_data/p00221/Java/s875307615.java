import java.io.*;
import java.lang.*;
import java.util.*;

class Main
{
    
    public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	while(true)
	    {
		String line;
		line = in.readLine();
		int m,n;
		m = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		n = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		if(n+m == 0)break;

		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=1;i<=m;i++)
		    list.addLast(i);

		int pos = 0;

		for(int i=1;i<=n;i++)
		    {
			line = in.readLine();
			if(i%3 == 0 || i%5 == 0)
			    {
				boolean ok = true;
				if(i%3 == 0 && i%5 == 0)
				    {
					if(!line.equals("FizzBuzz"))
					    ok = false;
				    }
				else if(i%3 == 0)
				    {
					if(!line.equals("Fizz"))
					    ok = false;
				    }
				else 
				    {
					if(!line.equals("Buzz"))
					    ok = false;
				    }
				
				if(!ok)
				    list.remove(pos);
				    
			    }
			else
			    {
				if(i != Integer.parseInt(line))
				    list.remove(pos);
			    }

			pos++;
			if(pos >= list.size())
			    pos = 0;
		    }

		for(int i=0;i<list.size();i++){
		    System.out.print(list.get(i));
		    if(i == list.size()-1)System.out.println("");
		    else System.out.print(" ");
		}

	    }
    }
}