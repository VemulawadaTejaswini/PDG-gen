import java.util.*;
import java.io.*;
 
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
      	int k = Integer.parseInt(sc.next());
      	PrintWriter out = new PrintWriter(System.out);
      	ArrayList<Integer> list = new ArrayList<>();
      	for(int cnt = 0;cnt < n;cnt++){
        	list.add(Integer.parseInt(sc.next()));
        }
      	for(int cnt = k;cnt < n;cnt++){
        	if(list.get(i - k) < list.get(cnt)){
            	out.println("Yes");
            }else{
            	out.println("No");
            }
        }
      	out.flush();
    }
}