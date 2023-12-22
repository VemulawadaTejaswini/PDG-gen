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
      	if(list.indexOf("W") == -1 || list.indexOf("W") > list.lastIndexOf("R") && list.indexOf("R") != -1){
        	System.out.println(-1);
        }else if(list.indexOf("R") == -1){
        	System.out.println(1);
        }else{
          	int w = 0;
          	int r = 0;
          	for(int i = list.size() - 1; i > list.indexOf("R");i--){
            	if(list.get(i).equals("R")){
                	r++;
                }
            }
          	for(int i = 0;i < list.indexOf("R");i++){
            	if(list.get(i).equals("R")){
                	w++;
                }
            }
          	if(r < w){
            	System.out.println(w);
            }else{
            	System.out.println(r);
            }
        }
    }
}