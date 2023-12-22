import java.io.*;
import java.util.*;

class Main{
		public static ArrayList<Integer> sum_sequence(ArrayList<Integer> list){
			ArrayList <Integer> out = new ArrayList<Integer>();
			int axis,sum=0,t=0;
					
			for(int i=0;i<list.size();i++){
				axis = i;
				if(list.get(axis) < 0)continue;
				if(i == list.size()-1){
					sum = list.get(axis)+list.get(axis-1);
					out.add(sum);
					sum = 0;
				}
				else{
					sum = list.get(axis);
					for(int j=axis;j<list.size()-1;j++){
						if(list.get(j+1) > 0){
							t = sum + list.get(j+1);
							out.add(t);
						}
						sum += list.get(j+1);
					}
					out.add(sum);
					sum = list.get(axis);
					for(int j=axis;j<list.size()-1;j++){
						if(list.get(j+1) < 0){break;}
						else {sum += list.get(j+1);}
					}
					out.add(sum);
					sum = 0;
				}
			}
			return out;
		}
		
		public static void print_result(ArrayList<Integer> list){
			int max=Integer.MIN_VALUE;
			for(int i=0;i<list.size();i++){
				if(max < list.get(i))max = list.get(i);
			}
			System.out.println(max);
		}
		
		public static void main(String args[]) throws IOException{
			String str;
			ArrayList <Integer> inp = new ArrayList<Integer>();
			ArrayList <Integer> out = new ArrayList<Integer>();

			Scanner scan = new Scanner(System.in);
			
			while(scan.hasNext()){
				str = scan.next();
				inp.clear();
				int count = Integer.valueOf(str).intValue();
				if(count == 0)break;
				for(int i=0;i<count;i++){
					str = scan.next();
					int x = Integer.valueOf(str).intValue();
					inp.add(x);
				}
				out = sum_sequence(inp);
				print_result(out);
			}
		}
}