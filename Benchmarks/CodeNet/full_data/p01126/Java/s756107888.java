import java.util.*;
import java.text.*;
class Data {
	int h;
	int x;
	int y;
	public static void data(){	
	}	
}

public class Main {
	public static ArrayList<Data> sort(ArrayList<Data> data){
		for(int i=0; i<data.size(); i++){
			for(int j=i; j<data.size(); j++){
				if(data.get(i).h<data.get(j).h){
					Data tmp = new Data();
					tmp = data.get(i);
					data.set(i, data.get(j));
					data.set(j, tmp);
				}
			}
		}
		return data;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Data> data = new ArrayList<Data>();
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			int a = in.nextInt();
			if((n|m|a)==0) break;
			for(int i=0; i<n; i++){
				list.add(i+1);
			}
			for(int i=0; i<m; i++){
				Data tmp = new Data();				
				tmp.h=in.nextInt();
				tmp.x=in.nextInt();
				tmp.y=in.nextInt();
				data.add(tmp);
			}
			data = sort(data);
			int dummy = 0;
			for(int i=0; i<m; i++){
				dummy = list.get(data.get(i).x-1);
				list.set(data.get(i).x-1, list.get(data.get(i).y-1));
				list.set(data.get(i).y-1, dummy);
			}
			
			for(int i=0; i<list.size(); i++){
				if(list.get(i)==a){
					System.out.println(i+1);
					break;
				}
			}
		}
		list.clear();
		data.clear();
	}	
}