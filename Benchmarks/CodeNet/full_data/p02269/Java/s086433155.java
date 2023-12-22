import java.io.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i,j,n=0,hz=0,sc;
    BufferedReader sca=new BufferedReader(new InputStreamReader(System.in));;
    String yomi,sp[]=new String[2];//0:order 1:name
    try{
    n=Integer.parseInt(sca.readLine());
    }catch(Exception e){
	System.out.println(e);
    }
    String dic[] = new String[n];
    for(i=0;i<n;i++){
	try{
	sp=(sca.readLine()).split("[\\s]+");
	}catch(Exception e){
	    System.out.println(e);
	}
    	if(sp[0].equals("insert")){
	    for(sc=0;sc<n;sc++){
		hz=myhash(sp[1],n)+sc*(1+myhash(sp[1].n-1));
		if(dic[hz]==null){
		    dic[hz]=sp[1];
		    break;
	    }
    	}
	}
    	if(sp[0].equals("find")){
	    for(sc=0;sc<n;sc++){
		hz=myhash(sp[1],n)+sc*(1+myhash(sp[1].n-1));
		if(dic[hz]==null){
		    break;
      		}
		if(dic[hz].equals(sp[1])){
		    break;
		}
	    }
    		if(dic[hz]==null){
    			System.out.println("no");
    		}else{
    			System.out.println("yes");
    		}
    	}
	
    }
	}
    
    public static int myhash(String data,int ti){//A=2,C=3,G=5,T=7;
	int k,h;
        String moji[];
	moji=data.split("");
	//	System.out.println(moji[0]);
	h=1;
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
	return h%ti;
    }

}
