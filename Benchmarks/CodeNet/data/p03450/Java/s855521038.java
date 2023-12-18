import java.util.*;
import java.io.*;
class Main
{
	static BetterScanner s = new BetterScanner(System.in);
	static int nodes , edges ,currnode , flag ;
	static int[] visit ,newvisit;
	static LinkedList<Integer> list[];
	static HashMap<String,Long> hmap = new HashMap<>();
	static long sum =0 ;
	static Queue<Integer> queries = new LinkedList<>();
	static int[] arr = new int[100100];

	public static void dfs(int value)
	{
		visit[value] = 1;
		
		Iterator<Integer> itr = list[value].iterator();


		abc:while(itr.hasNext())
		{
			int ele = itr.next();

			if(visit[ele]==0)
			{
				// System.out.println(value+" "+ele);
				 sum+=hmap.get(value+" "+ele);

				 // System.out.println("sum of "+value+" and "+ele+" = "+sum);
				
				if(hmap.containsKey(currnode+" "+ele))
				{
					// System.out.println("value of "+currnode+" and "+ele+" = "+hmap.get(currnode+" "+ele));
					if(hmap.get(currnode+" "+ele)!=sum)
					{
						flag = 1;
						break abc;
					}
				}
				else
				{
					hmap.put((currnode+" "+ele),sum);
					hmap.put((ele+" "+currnode),-sum);
				}
				

				dfs(ele);
				sum-=hmap.get(value+" "+ele);
			}
		}





	}


	public static void main(String[] args)
	{
		nodes = s.nextInt();
		edges = s.nextInt();
		newvisit = new int[nodes+1];
		list = new LinkedList[nodes+1];
		for(int i =0 ;i<nodes+1;i++)
			list[i] = new LinkedList();

		for(int i =0 ;i<edges;i++)
		{
			int l = s.nextInt();
			int r = s.nextInt();
			long d = s.nextLong();

			list[l].add(r);
			if(arr[l] == 0)
				queries.add(l);
			arr[l] = 1;

			hmap.put( (l+" "+r), d);
			hmap.put((r+" "+l),-d );
		}

		while(!queries.isEmpty())
		{
			int i = queries.remove();
			visit = new int[nodes+1];
			currnode = i;
			sum =0 ;
			newvisit[i]=1;
			dfs(i);			
			if(flag == 1)
				break;
		}

		if(flag == 0)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	 public static class BetterScanner {
 
    private InputStream stream;
    private byte[] buffer = new byte[1024];
    private int pointer = 0;
    private int bufferLength = 0;
 
    public BetterScanner(InputStream stream) {
      this.stream = stream;
    }
 
    private boolean updateBuffer() {
      if (pointer >= bufferLength) {
        pointer = 0;
        try {
          bufferLength = stream.read(buffer);
        } catch (IOException exception) {
          exception.printStackTrace();
        }
        return bufferLength > 0;
      } else {
        return true;
      }
    }
 
    private int read() {
      if (updateBuffer()) {
        return buffer[pointer ++];
      } else {
        return -1;
      }
    }
 
    public boolean hasNext() {
      skipUnprintable();
      return updateBuffer();
    }
 
    private void skipUnprintable() { 
      while (updateBuffer() && !isPrintableChar(buffer[pointer])) {
        pointer ++;
      }
    }
 
    public String next() {
      if (hasNext()) {
        StringBuilder builder = new StringBuilder();
        int codePoint = read();
        while (isPrintableChar(codePoint)) {
          builder.appendCodePoint(codePoint);
          codePoint = read();
        }
        return builder.toString();
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public long nextLong() {
      if (hasNext()) {
        long number = 0;
        boolean minus = false;
        int codePoint = read();
        if (codePoint == '-') {
          minus = true;
          codePoint = read();
        }
        if (codePoint >= '0' && codePoint <= '9') {
          while (true) {
            if (codePoint >= '0' && codePoint <= '9') {
              number *= 10;
              number += codePoint - '0';
            } else if (codePoint < 0 || !isPrintableChar(codePoint)) {
              return (minus) ? -number : number;
            } else {
              throw new NumberFormatException();
            }
            codePoint = read();
          }
        } else {
          throw new NumberFormatException();
        }
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public int nextInt() {
      long number = nextLong();
      if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
        return (int)number;
      } else {
        throw new NumberFormatException();
      }
    }
 
    private boolean isPrintableChar(int codePoint) {
      return codePoint >= 33 && codePoint <= 126;
    }
 
  }
 

}