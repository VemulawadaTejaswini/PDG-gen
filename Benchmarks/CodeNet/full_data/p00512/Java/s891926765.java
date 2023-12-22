import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,length=0,max=0,min=1000000;
            boolean first=true;
            Map<String,Integer> map=new HashMap<String,Integer>();
            LinkedHashSet<String> set=new LinkedHashSet<String>();
            while ((line = br.readLine()) != null) {
            	if(first){
            		length=Integer.parseInt(line);
            		first=false;
            	}else{
            		String[] tokens=line.split(" ");
            		if(!map.containsKey(tokens[0])){
            			map.put(tokens[0], Integer.parseInt(tokens[1]));
            		}else{
            			int a=map.get(tokens[0])+Integer.parseInt(tokens[1]);
            			map.put(tokens[0], a);
            		}
            		if(max<tokens[0].length()){
            			max=tokens[0].length();
            		}
            		if(min>tokens[0].length()){
            			min=tokens[0].length();
            		}
            		set.add(tokens[0]);
            		i++;
            		if(i==length){
            			break;
            		}
            	}
            }
            TreeSet<String> treeSet = new TreeSet<String>(set);
            Iterator<String> itr=treeSet.iterator();
            for(int k=1;k<=max;k++){
            	itr=treeSet.iterator();
            	while(itr.hasNext()){
            		String s=itr.next();
            		if(k==s.length()){
            			System.out.println(s+" "+map.get(s));
            		}
            	}
            }
        }
    }

}