import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0,i=0;
            boolean first=true;
            Set<String> set=new HashSet<String>();
            while ((line = br.readLine()) != null) {
             	if(first){
            		n=Integer.parseInt(line);
            		i=0;
            		first=false;
            	}else{
            		String[] str=line.split(" ");
            		if(str[0].equals("insert")){
            			set.add(str[1]);
            		}else{
            			System.out.println(set.contains(str[1])?"yes":"no");
            		}
            		i++;
            		if(i==n){
            			break;
            		}
            	}
            }
        }
	}

}