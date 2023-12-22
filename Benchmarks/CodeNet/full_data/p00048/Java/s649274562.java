import java.io.*;

public class Main{
    public static void main(String[] args){
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	String s;
	double n;
	try{
	    while((s=reader.readLine()) !=null){
		n=Double.parseDouble(s);
		if(n<=48.00){
		    System.out.println("lightfly");
		}
		if(n>48.00 && n<=51.00){
		    System.out.println("fly");
		}
		if(n>51.00 &&n<=54.00){
		    System.out.println("bantam");
		}
		if(n>54.00 && n<=57.00){System.out.println("feather");}
		if(n>57.00 &&n<=60.00){System.out.println("light");}
		if(n>60.00 &&n<=64.00){System.out.println("light welter");}
		if(n>64.00 &&n<=69.00){System.out.println("welter");}
		if(n>69.00 &&n<=75.00){System.out.println("light middle");}
		if(n>75.00 &&n<=81.00){System.out.println("middle");}
		if(n>81.00 &&N<=91.00){System.out.println("light heavy");
		}else{System.out.println("heavy");}
	    }
	}catch(IOException e){
	    System.out.println(e);
	}
    }
}