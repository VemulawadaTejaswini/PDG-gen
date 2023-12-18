import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
	
	static int N,K,Answer;
	static int temp;
	static ArrayList<Integer> leftArr = new ArrayList<Integer>();
	static ArrayList<Integer> rightArr = new ArrayList<Integer>();
	static boolean contains0 = false;
	static TreeSet<Integer> ts = new TreeSet<Integer>();
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String lineA = br.readLine();
		N = Integer.valueOf(lineA.split(" ")[0]);
		K = Integer.valueOf(lineA.split(" ")[1]);
		String lineB = br.readLine();
		String[] bStrArr = lineB.split(" ");
		
		if(Integer.valueOf(bStrArr[0]) >=0){
			Answer = Integer.valueOf(bStrArr[K-1]);
		}else if(Integer.valueOf(bStrArr[N-1]) <=0){
			Answer = Math.abs(Integer.valueOf(bStrArr[0]));
		}else{
			for(int i=0;i<N;i++){
				temp =  Integer.valueOf(bStrArr[i]);
				if(temp < 0){
					leftArr.add(temp);
				}else{
					if(temp==0){
						contains0=true;
					}else{
						rightArr.add(temp);
					}
				}
			}
			int index=0;
			if(contains0 ){
				if(K==1){
					Answer = 0;
				}else{
					K=K-1;
				}
				
			}
			getTime(index,leftArr.size(),-1,0,0);
			Answer = ts.first();
			
		}
		System.out.println(Answer);
	}
	/*
8 3
-9 -7 -4 -3 1 2 3 4
	 */
	// flag 0开始，1 右，-1左
	private static void getTime(int index, int leftIndex, int rightIndex,int ans,int flag) {
		//System.out.println("index="+index+",leftIndex="+leftIndex+",rightIndex="+rightIndex+",ans="+ans+",flag="+flag);
		if(index == K){
			ts.add(ans);
			return;
		}else{
			if(flag == 0){
				if(leftIndex-1>=0){
					getTime(index+1, leftIndex-1, rightIndex,ans-leftArr.get(leftIndex-1),-1);
				}
				if( rightIndex+1 <rightArr.size()){
					getTime(index+1, leftIndex, rightIndex+1,ans+rightArr.get(rightIndex+1),1);
				}
			}else if(flag == 1){
				if(leftIndex-1>=0){
					getTime(index+1, leftIndex-1, rightIndex,ans-leftArr.get(leftIndex-1)+rightArr.get(rightIndex),-1);
				}
				if( rightIndex+1 <rightArr.size()){
					getTime(index+1, leftIndex, rightIndex+1,ans+rightArr.get(rightIndex+1)-rightArr.get(rightIndex),1);
				}
			}else if(flag == -1){
				if(leftIndex-1>=0){
					getTime(index+1, leftIndex-1, rightIndex,ans-(leftArr.get(leftIndex-1)-leftArr.get(leftIndex)),-1);
				}
				if( rightIndex+1 <rightArr.size()){
					getTime(index+1, leftIndex, rightIndex+1,ans+rightArr.get(rightIndex+1)-leftArr.get(leftIndex),1);
				}
			}
		}
	}
}
