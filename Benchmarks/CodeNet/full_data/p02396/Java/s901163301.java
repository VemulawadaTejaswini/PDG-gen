import java.io.*;
class Main{
    public static void main(String args[]) throws IOException{
	int w=1;
	int j=0,k=0;
	int x=0,l=1;
	int[] arry = new int[100];
	while(w>0)
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    j=Integer.parseInt(str);
	    if(j==0)break;
	    arry[l]=j;
	    l++;
	    k=l;
	}
	for(int i=1;i<k;i++){
	    x=arry[i];
	    System.out.println("Case "+ i +": "+x);
	}
    }
}