import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Map<String,String> resultMap = new HashMap<String, String>();
    	resultMap.put("A", "T");
    	resultMap.put("C", "G");
    	resultMap.put("G", "C");
    	resultMap.put("T", "A");
    	Scanner scanner = new Scanner(System.in);
    	String line = scanner.next();
    	scanner.close();
    	System.out.println(resultMap.get(line));
    }}

