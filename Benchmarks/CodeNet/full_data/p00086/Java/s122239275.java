import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	boolean solve(HashMap<Integer,Integer> v){
		boolean flag=true;
		int edge=0;
		for(Entry<Integer,Integer> e:v.entrySet()){
			if(e.getKey()==1||e.getKey()==2){
				edge+=e.getValue();
			}
			else{
				if(e.getValue()%2!=0)flag=false;
			}
		}
		if(edge%2!=0)flag=false;
		return flag;
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
					v.remove(a);
				}
				v.put(a,n);

				n=1;
				if(v.containsKey(b)){
					n=v.get(b)+1;
					v.remove(b);
				}
				v.put(b,n);
			}
			System.out.println(solve(v)?"OK":"NG");
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}