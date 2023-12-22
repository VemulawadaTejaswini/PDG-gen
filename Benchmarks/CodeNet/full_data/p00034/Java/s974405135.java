import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] road;
	static int v1, v2;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		road = new int[10];
		String[] in = sc.next().split(",");
		for(int i = 0; i < road.length; i++){
			road[i] = Integer.parseInt(in[i]);
		}
		v1 = Integer.parseInt(in[10]);
		v2 = Integer.parseInt(in[11]);
		return true;
	}
	
	static void solve(){
		int road_length = 0;
		for(int i = 0; i < road.length; i++){
			road_length += road[i];
		}
		double per = (v1 + 0.0)/(v1+v2 + 0.0);
		int res = 0;
		double per_length = 0.0;
		for(int i = 0; i < road.length; i++){
			per_length += (road[i]+0.0)/(road_length+0.0);
			//System.out.println(per_length);
			if(per_length >= per){res = i+1;break;}
		}
		//System.out.println("road length = " + road_length + " per = " + per + " v1 = " + v1 + " v2 = " + v2);;
		System.out.println(res);
	}

}