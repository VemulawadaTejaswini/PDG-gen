import java.util.*;
import java.io.*;
import java.lang.*;

class Main{


    public static void main(String args[])throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	while(true){
	    String NARIYOSHI_X = in.readLine();
	    StringBuilder val = new StringBuilder(NARIYOSHI_X);
	    if(NARIYOSHI_X.charAt(0) == '-')break;
	    int teger,deci;
	    if(val.indexOf(".") != -1){
		teger = Integer.parseInt(val.substring(0,val.indexOf(".")));
		deci = Integer.parseInt(val.substring(val.indexOf(".")+1));
	    }
	    else {
		teger = Integer.parseInt(NARIYOSHI_X);
		deci = 0;
	    }
if(teger > 255){
System.out.println("NA");
continue;
}
	    //	    System.out.println("test : " + teger + " . " + deci);
	   
	    List<Boolean> list = new ArrayList<Boolean>();
	    List<Boolean> list2 = new ArrayList<Boolean>();
	    if(teger != 0){
		while(teger != 1){
		    boolean bval;
		    
		    if(list.size() > 8){
			break;
		    }
		    
		    if(teger%2 == 0)bval = false;
		    else bval = true;
		    list.add(bval);
		    teger = teger/2;
		}
		list.add(true);
	    }
	    
	    if(list.size() > 8){
		System.out.println("NA");
		continue;
	    }

	    Collections.reverse(list);

	    if(deci != 0){
		double ddec;
		String s = "0";
		s += NARIYOSHI_X.substring(NARIYOSHI_X.indexOf("."));
        
		ddec = Double.parseDouble(s);
        	
		while(ddec != 0.0){
		    if(list2.size() > 4)break;		    
		    
		    ddec*=2.0;
		    if(ddec >= 1.0){
			list2.add(true);
			ddec -= 1.0;
		    }
		    else {
			list2.add(false);
		    }
		}
		
		if(list2.size() > 4){
		    System.out.println("NA");
		    continue;
		}
		
		Collections.reverse(list2);
		
	    }
	    
	    if(list.size() < 8){
		for(int i=0;i<8-list.size();i++){
		    System.out.print(0);
		}
	    }
	    
	    for(int i=0;i<list.size();i++){
		if(list.get(i))System.out.print(1);
		else System.out.print(0);
	    }
	    System.out.print(".");
	    for(int i=0;i<list2.size();i++){
		if(list2.get(i))System.out.print(1);
		else System.out.print(0);
	    }

	    if(list2.size() < 4){
		for(int i=0;i<4-list2.size();i++){
		    System.out.print(0);
		}
	    }

	    System.out.println("");

	}

    }

}