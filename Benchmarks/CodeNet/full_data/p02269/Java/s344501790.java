import java.io.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i,j,n=0,hz=0,sc,ha1=0,ha2=0;
    BufferedReader sca=new BufferedReader(new InputStreamReader(System.in));;
    String yomi,sp[]=new String[2];//0:order 1:name
    try{
    n=Integer.parseInt(sca.readLine());
    }catch(Exception e){
	System.out.println(e);
	System.exit(0);
    }
    String dic[] = new String[n];
    for(i=0;i<n;i++){
	try{
	sp=(sca.readLine()).split("[\\s]+");
	}catch(Exception e){
	    System.out.println(e);
	    System.exit(0);
	}
    	if(sp[0].equals("insert")){
	    ha1=myhash(sp[1],n);
	    if(i!=0){
	   ha2=1+myhash(sp[1],n-1);
	    }
	    for(sc=0;sc<n;sc++){
		hz=(ha1+sc*ha2)%n;
		if(dic[hz]==null){
		    dic[hz]=sp[1];
		    break;
	    }
	    }
	}
    	if(sp[0].equals("find")){
	    ha1=myhash(sp[1],n);
	    if(i!=0){
	    ha2=1+myhash(sp[1],n-1);
	    }
	    for(sc=0;sc<n;sc++){
		hz=(ha1+sc*ha2)%n;
		if(dic[hz]==null){
		    break;
      		}
		if(dic[hz].equals(sp[1])){
		    break;
		}
	    }
    		if(dic[hz]==null||sc==n){
    			System.out.println("no");
    		}else{
    			System.out.println("yes");
    		}
    	}
	
    }
	}
    
    public static int myhash(String data,int ti){//A=2,C=3,G=5,T=7;
	int k;
	long h;
        String moji[];
	moji=data.split("");
	h=1l;
	for(k=0;k<moji.length;k++){
	    if(moji[k].equals("A")){
		h*=2;
	    }else if(moji[k].equals("C")){
		h*=3;
	    }else if(moji[k].equals("G")){
		h*=5;
	    }else if(moji[k].equals("T")){
		h*=7;
	    }
	}
	return (int)(h%(long)ti);
    }

}

