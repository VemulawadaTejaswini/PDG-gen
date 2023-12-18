import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static String toUpper(int i){
		switch(i){
			case 0:
			case 1:
				return ".";
			case 2:
			case 3:
				return "#";
			default:
			    return "?";
		}
	}//0,1->"." 2,3->"#"
	public static String toLower(int i){
		switch(i){
			case 0:
			case 2:
				return ".";
			case 1:
			case 3:
				return "#";
			default:
			    return "?";
		}
	}//0,2->"." 1,3->"#"
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String upper = "",
               lower = "";
        boolean end = false;
        int next = 0;
        while(!end && next<4){
        	System.out.println(upper + toUpper(next));
        	System.out.println(lower + toLower(next));
        	String result = br.readLine();
        	if(result.equals("end")){
        		upper = upper + toUpper(next);
        		lower = lower + toLower(next);
        		end = true;
        	}
        	else if(result.equals("T")){
        		upper = upper + toUpper(next);
        		lower = lower + toLower(next);
        		next = 0;
        	}
        	else next++;
        }//upper and lower is the right edge
        next = 0;
        while(!end){
        	System.out.println(toUpper(next) + upper);
        	System.out.println(toLower(next) + lower);
        	String result = br.readLine();
        	if(result.equals("end")){
        		upper = toUpper(next) + upper;
        		lower = toLower(next) + lower;
        		end = true;
        	}
        	else if(result.equals("T")){
        		upper = toUpper(next) + upper;
        		lower = toLower(next) + lower;
        		next = 0;
        	}
        	else next++;
        }
    }
}