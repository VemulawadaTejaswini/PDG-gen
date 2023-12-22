import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	static int count=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		//?????????
		int n = Integer.parseInt(bf.readLine());
		ArrayList<Integer> array=new ArrayList<Integer>();
		String[] list=bf.readLine().split(" ");
		for(int i=0;i<n;i++){
			array.add(Integer.parseInt(list[i]));
		}
		
		
		int q=partition(array, 0, array.size()-1);
		
		for(int i=0;i<array.size();i++){
			if(i!=0){
				System.out.printf(" ");
			}
			if(i==q){
				System.out.printf("[");
			}
			System.out.printf("%d",array.get(i));
			if(i==q){
				System.out.printf("]");
			}

		}
		System.out.println("");
	}
	
	public static int partition(ArrayList<Integer> array,int p,int r){
		int x=array.get(r);
		int i=p-1;
		
		for(int j=p;j<r;j++){
			if(array.get(j)<=x){
				i++;
				int tmp=array.get(i);
				array.set(i, array.get(j));
				array.set(j, tmp);
			}
		}
		
		int tmp=array.get(i+1);
		array.set(i+1, array.get(r));
		array.set(r, tmp);
		
		return i+1;
		
	}

}