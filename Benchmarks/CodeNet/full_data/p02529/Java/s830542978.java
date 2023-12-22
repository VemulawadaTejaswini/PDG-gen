import java.util.*;

class Main
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	int[] s = new int[101];
	int[] t = new int[101];
	int n,q;
	int count=0;

	n = sc.nextInt();
	for(int i=0;i<n;i++)
	    {
		s[i] = sc.nextInt();
	    }
	q = sc.nextInt();
	for(int i=0;i<q;i++)
	    {
		t[i] = sc.nextInt();
	    }

	for(int i=0;i<q;i++)
	    {
		for(int j=0;j<n;j++)
		    {
			if(t[i] == s[j])
			    {
				count++;
				break;
			    }
      		    }
	    }

	System.out.println(count);
    }
}