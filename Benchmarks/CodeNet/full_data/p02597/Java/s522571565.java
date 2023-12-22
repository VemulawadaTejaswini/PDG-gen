import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	ArrayList<String> list = new ArrayList<>();
      	char[] c = sc.next().toCharArray();
      	for(int cnt = 0;cnt < c.length;cnt++){
        	list.add(String.valueOf(c[cnt]));
        }
      	if(list.indexOf("W") == -1 || list.indexOf("W") > list.lastIndexOf("R") || list.indexOf("R") == -1){
        	System.out.println(0);
        }else{
          	String w = "";
          	String r = "";
          	int count = 0;
          	while(list.indexOf("W") < list.lastIndexOf("R")){
            	list.set(list.indexOf("W"),"R");
              	list.set(list.lastIndexOf("R"),"W");
              	count++;
            }
      		System.out.println(count);
        }
    }
}