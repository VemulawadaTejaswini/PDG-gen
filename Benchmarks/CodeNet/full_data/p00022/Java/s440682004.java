import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br=
	    new BufferedReader(new InputStreamReader(System.in));
	String buf;
	while(true){
	    buf=br.readLine();
	    if(Integer.parseInt(buf)==0)break;
		int data=0;
	    for(int i=0;i<Integer.parseInt(buf);i++){
		int input;
		if((input=Integer.parseInt(br.readLine()))>0)
		    data+=input;
	    }
	    System.out.println(data);
	}
    }
}