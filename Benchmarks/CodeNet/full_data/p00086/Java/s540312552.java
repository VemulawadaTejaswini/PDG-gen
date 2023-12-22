import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	boolean solve(HashMap<Integer,Integer> v){
		boolean even=true;
		for(Entry<Integer,Integer> e:v.entrySet()){
			if(e.getValue()%2!=0)even=false;
		}
		return even;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		HashMap<Integer,Integer> v;
		sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			v=new HashMap<Integer,Integer>();
			int a,b;
			while(true){
				a=ni();b=ni();
				if(a==0&&b==0)break;
				
				int n=1;
				if(v.containsKey(a)){
					n=v.get(a)+1;
				}
				v.put(a,n);

				n=1;
				if(v.containsKey(b)){
					n=v.get(b)+1;
				}
				v.put(b,n);
			}
			v.put(1,v.get(1)+1);
			v.put(2,v.get(2)+1);
			
			System.out.println(solve(v)?"OK":"NG");
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}