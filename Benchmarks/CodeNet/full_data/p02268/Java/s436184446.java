import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
		
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            line=br.readLine();
            Set<Integer> set1=new HashSet<Integer>();
            Set<Integer> set2=new HashSet<Integer>();
            line=br.readLine();
            String[] str=line.split(" ");
            for(int i=0;i<str.length;i++){
            	set1.add(Integer.parseInt(str[i]));
            }
            line=br.readLine();
            line=br.readLine();
            str=line.split(" ");
            for(int i=0;i<str.length;i++){
            	set2.add(Integer.parseInt(str[i]));
            }
            int result=0;
            if(set1.size()>set2.size()){
            	Iterator it=set2.iterator();
            	while(it.hasNext()){
            		if(set1.contains(it.next())){
            			result++;
            		}
            	}
            }else{
            	Iterator it=set1.iterator();
            	while(it.hasNext()){
            		if(set2.contains(it.next())){
            			result++;
            		}
            	}
            }
            System.out.println(result);
        }
	}

}