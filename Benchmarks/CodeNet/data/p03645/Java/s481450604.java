import java.util.*;

public class Main {

    public static void main(String args[]){

    	Scanner scan = new Scanner(System.in);
    	int N = Integer.parseInt(scan.next());
    	int M = Integer.parseInt(scan.next());
    	List <Integer> a = new ArrayList<Integer>();
    	List <Integer> b = new ArrayList<Integer>();

    	int flag = 0;

    	for(int cnt = 0; cnt < M; cnt++ ){
    		//始点
    		a.add(Integer.parseInt(scan.next()));
    		//終点
    		b.add(Integer.parseInt(scan.next()));
    	}

    		if((a.indexOf(1) != -1)&&(b.indexOf(N) != -1)){
    			if(b.get(a.indexOf(1)) == a.get(b.indexOf(N))){
    				System.out.println("POSSIBLE");
    				return;
    			}
    		}

    		System.out.println("IMPOSSIBLE");


    }

}