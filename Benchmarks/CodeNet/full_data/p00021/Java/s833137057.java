import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br
	    = new BufferedReader(new InputStreamReader(System.in));
	String buf;
	double[] data=new double[8];
	int n=Integer.parseInt(br.readLine());
	for(int k=0;k<n;k++){
	    if((buf=br.readLine())==null)break;
	    if(buf.length()==0)break;
	    
	    String[] buf2=buf.split(" ");
	    for(int i=0;i<8;i++){
		data[i]=Double.parseDouble(buf2[i]);
	    }
	    double data1=((data[1]-data[3])/(data[0]-data[2]));
	    double data2=((data[5]-data[7])/(data[4]-data[6]));
	    System.out.println(data1);
	    System.out.println(data2);
	    if(data1==data2)
		System.out.println("YES");
	    else
		System.out.println("NO");
	}
    }
}