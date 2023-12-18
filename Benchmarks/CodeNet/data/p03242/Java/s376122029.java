import java.io.*;

class Count
{
    public static int[] count(int[] x)
    {
	int[] ans = new int[2];
	
	int[] a = new int[x.length];

	int[] j = new int[2];
	j[0] = 0;
	j[1] = 0;

	for(int i=0; i<x.length; i++){
	    int k=0;
	    for(int l=0; l<x.length; l++){
		if(x[i]==x[l])
		    k++;
	    }
	    a[i]=k;
	}

	
	
	for(int i=0; i<x.length; i++){
	    if(a[i]>j[0]){
		j[0]=a[i];
		j[1]=x[i];
	    }   
	}

	ans[0] = x.length - j[0];
	ans[1] = j[1];
	
	return ans; 
    }
}

class Main
{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String  str = br.readLine();
	int n = Integer.parseInt(str);

	str = br.readLine();
	String[] ar = str.split(" ");

	int[] num_ar = new int[100000];
	for(int i=0; i<n; i++)
	    num_ar[i] = Integer.parseInt(ar[i]);

	int[] a = new int[n / 2];
	int[] b = new int[n / 2];
	for(int i=0; i<n/2; i++){
	    a[i] = num_ar[2*i];
	    b[i] = num_ar[2*i+1];
	}

	int[] c = Count.count(a);
	int[] d = Count.count(b);
	
	if(c[1]==d[1])
	    System.out.println(n / 2);
	else
	    System.out.println(c[0]+d[0]);
    }
}