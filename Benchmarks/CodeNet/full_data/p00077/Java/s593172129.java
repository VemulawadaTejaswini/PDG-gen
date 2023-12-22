import java.util.regex.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
     while(scan.hasNext()){
    	 String line =scan.nextLine();
    	 Pattern p = Pattern.compile("@(\\d)(.)");
    	 Matcher m = p.matcher(line);
    	while(m.find()){
    		line = m.replaceFirst(repeat("$2",Integer.parseInt(m.group(1))));
    		m = p.matcher(line);
    		 }
    	 System.out.println(line);
     }
    }
    public static String repeat(String s,int n){
    	String str ="";
    	for(int i=0;i<n;i++){
    		str=str.concat(s);
    	}
    	return str;
    }
}