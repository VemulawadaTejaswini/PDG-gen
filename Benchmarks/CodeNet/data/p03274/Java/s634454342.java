import java.util.ArrayList;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] data = new int[N];
		for(int i= 0;i < N;i++){
			data[i] = scan.nextInt();
		}

		ArrayList<Integer> ansdata = new ArrayList<Integer>();
		
		int first = Integer.MAX_VALUE;
		int firstanc=0;
		for(int i= 0;i < N-1;i++){
			if(Math.abs(data[i])< first){
				firstanc = i;
			}
			first = Math.min(Math.abs(data[i]), first);
			
		}
		
		
		ansdata = Check(ansdata,data,0,data[0],0,K,N);
		ansdata = Check(ansdata,data,0,data[0],1,K,N);

		int min = Integer.MAX_VALUE;
		for(int i = 0;i < ansdata.size();i++){
			min = Math.min(min, ansdata.get(i));
		}
		
		System.out.println(min);
		
	}
	
	static ArrayList<Integer> Check(ArrayList<Integer> ansdata,int[] data,int index,int sum,int count,int K,int N){
		
		if(index == N){
			return ansdata;
		}
		
		
		if(count == K ){
			ansdata.add(sum);
			return ansdata;
		}
		
		Check(ansdata, data, index+1, sum+Math.abs( data[index]), count+1, K,N);
		Check(ansdata, data, index+1, sum, count, K,N);

		
		return ansdata;
		
		
	}



}
