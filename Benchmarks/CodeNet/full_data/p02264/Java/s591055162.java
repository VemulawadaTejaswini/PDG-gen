import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
  
class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String[] st1=br.readLine().split(" ");
    int n=Integer.parseInt(st1[0]);
    int q=Integer.parseInt(st1[1]);
    HashMap<Integer, Integer> hm1=new HashMap<Integer,Integer>();
    HashMap<Integer,String> hm2=new HashMap<Integer,String>();
    LinkedList<Integer> lnk=new LinkedList<Integer>();
    for(int key=0;key<n;key++){
    	String[] st=br.readLine().split(" ");
    	String name=st[0];
    	int value=Integer.parseInt(st[1]);
    	hm1.put(key, value);
    	hm2.put(key, name);
    	lnk.add(key);
    }
    int time=0;
    while(lnk.isEmpty()==false){
    	for(int i=0;i<lnk.size();i++){
    		int key=lnk.get(i);
    		int t=hm1.get(key);
    		int left=t-q;
    		
    		if(left<=0){
    			time=time+t;
    			System.out.println(hm2.get(key)+" "+time);
    			hm1.remove(key);
    			hm2.remove(key);
    			lnk.remove(i);
    			i--;
    		}else {time=time+q;hm1.put(key, left);}
    	}
    }
    
    
    }
    }