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
			Answer = Math.abs(Integer.valueOf(bStrArr[N-K]));
		}else{
			for(int i=0;i<N;i++){
				temp =  Integer.valueOf(bStrArr[i]);
				if(temp < 0){
					leftArr.add(temp);
				}else if(temp==0){
					contains0=true;
				}else{
					rightArr.add(temp);
				}
			}
			if(contains0 ){
				if(K==1){
					Answer = 0;
				}else{
					K=K-1;
				}
			}
			
			//right
			int leftIndex = leftArr.size()-1;
			int rightIndex = 0;
			int answerRight = 0;
			for(int i=0;i<K;i++){
				int dright =0;
				int dleft=0;
				if(rightIndex<rightArr.size() && leftIndex>=0) {
					if(rightIndex == 0) {
						dright = rightArr.get(rightIndex);
					}else {
						dright = rightArr.get(rightIndex)-rightArr.get(rightIndex-1);
					}
					if(leftIndex == leftArr.size()-1) {
						dleft = Math.abs(leftArr.get(leftIndex));
					}else {
						dleft = Math.abs(leftArr.get(leftIndex))-Math.abs(leftArr.get(leftIndex+1));
					}
					if(dleft*2<dright) {
						answerRight += dleft*2;
						leftIndex--;
					}else {
						answerRight += dright;
						rightIndex++;
					}
				}else if(leftIndex>=0) {
					if(leftIndex == leftArr.size()-1) {
						dleft = Math.abs(leftArr.get(leftIndex));
					}else {
						dleft = Math.abs(leftArr.get(leftIndex))-Math.abs(leftArr.get(leftIndex+1));
					}
					answerRight += dleft*2;
					leftIndex--;
				}else {
					if(rightIndex == 0) {
						dright = rightArr.get(rightIndex);
					}else {
						dright = rightArr.get(rightIndex)-rightArr.get(rightIndex-1);
					}
					rightIndex++;
				}
			
			}
			//System.out.println("==================================================================");
			//left
			leftIndex = leftArr.size()-1;
			rightIndex = 0;
			int answerLeft = 0;
			for(int i=0;i<K;i++){
				int dleft=0;
				int dright=0;
				
				if(leftIndex>=0 && rightIndex<rightArr.size()){
					if(rightIndex == 0) {
						dright = rightArr.get(rightIndex);
					}else {
						dright = rightArr.get(rightIndex)-rightArr.get(rightIndex-1);
					}
					if(leftIndex == leftArr.size()-1) {
						dleft = Math.abs(leftArr.get(leftIndex));
					}else {
						dleft = Math.abs(leftArr.get(leftIndex))-Math.abs(leftArr.get(leftIndex+1));
					}
					if(dleft>dright*2){
						answerLeft+=dright*2;
						rightIndex++;
					}else{
						answerLeft+=dleft;
						leftIndex--;
					}
				}else if(rightIndex<rightArr.size()&& leftIndex<0){
					if(rightIndex == 0) {
						dright = rightArr.get(rightIndex);
					}else {
						dright = rightArr.get(rightIndex)-rightArr.get(rightIndex-1);
					}
					answerLeft+=dright;
					rightIndex++;
				}else if(leftIndex>=0 && rightIndex>=rightArr.size()){
					if(leftIndex == leftArr.size()-1) {
						dleft = Math.abs(leftArr.get(leftIndex));
					}else {
						dleft = Math.abs(leftArr.get(leftIndex))-Math.abs(leftArr.get(leftIndex+1));
					}
					answerLeft+=dleft;
					leftIndex--;
				}
			}
			if(answerLeft>answerRight){
				Answer = answerRight;
			}else{
				Answer = answerLeft;
			}
			
		}
		System.out.println(Answer);
	}

}