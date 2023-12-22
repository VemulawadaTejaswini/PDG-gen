import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
  
class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String[] st=br.readLine().split(" ");
    int n=Integer.parseInt(st[0]);
    int q=Integer.parseInt(st[1]);
    HashMap<String, Integer> hm1=new HashMap<String,Integer>();
    LinkedList<String> lnk=new LinkedList<String>();
    for(int key=0;key<n;key++){
    	st=br.readLine().split(" ");
    	String name=st[0];
    	int value=Integer.parseInt(st[1]);
    	hm1.put(name, value);
    	lnk.add(name);
    }
    int time=0;
    while(lnk.isEmpty()==false){
    	for(int i=0;i<lnk.size();i++){
    		String key=lnk.get(i);
    		int t=hm1.get(key);
    		int left=t-q;
    		
    		if(left<=0){
    			time=time+t;
    			System.out.println(key+" "+time);
    			hm1.remove(key);
    			lnk.remove(i);
    			i--;
    		}else {time=time+q;hm1.put(key, left);}
    	}
    }
        
    }
    }