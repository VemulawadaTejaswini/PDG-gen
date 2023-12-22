import java.io.*;
class Main{
    
    public static void main(String[] args)throws IOException{
	BufferedReader bf 
	    =new BufferedReader(new InputStreamReader(System.in));
	String buf;
	String[] data;
	while(true){
	    if((buf=bf.readLine())==null)break;
	    if(buf.length()==0)break;
	    data=buf.split(" ");
	    int a=Integer.parseInt(data[0]),b=Integer.parseInt(data[1]);
	    for(int i=(a>b?b:a);i>0;i--){
		if((a%i==0) && (b%i==0)){
		    System.out.print(i);
		    break;
		}
	    }

	    System.out.print(" ");
	    for(int i=(a>b? a:b);i<=200000000;i++){
		if((i%a==0)&&(i%b==0)){
		    System.out.println(i);
		    break;
		}
	    }
	}
    }
}