import java.io.*;
class Main{
    public static void main (String[] args)
   	throws IOException{
	int[] data=new int[10];
	int max1=0,max2=0,max3=0;
       BufferedReader br=
	   new BufferedReader(new InputStreamReader(System.in));
	for(int i=0;i<10;i++){
	    String buf=br.readLine();
	    data[i]=Integer.parseInt(buf);
	}
	boolean check1=true,check2=true;
	for(int i=0;i<10;i++){
	    if(i==0)max1=data[i];
	    else if(data[i]>max1){
		max1=data[i];
	    }else if(check1){
		max2=data[i];
		check1=false;
	    }else if(data[i]>max2){
		max2=data[i];
	    }
	    else if(check2){
		max3=data[i];
		check2=false;
	    }
	    else if(data[i]>max3){
		max3=data[i];
	    }
	}
	System.out.println(max1);
	System.out.println(max2);
	System.out.println(max3);
    }
}
	    