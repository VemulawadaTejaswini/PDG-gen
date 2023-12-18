import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String[] a;
		a = str.split(" ", 0);
		int n = Integer.parseInt(a[0]);
		int x = Integer.parseInt(a[1]);
		
		String str2 = br.readLine();
		String[] numstring = str2.split(" ", 0);
		int[] nums = new int[n];
		boolean[] numserased = new boolean[n];		//一つ前のループで消されたかどうかを調べる
		
		for(int i = 0; i < numstring.length; i++){
			nums[i] = Integer.parseInt(numstring[i]);
			numserased[i] = false;
		}
		
		int count = 0;		//キャンディをとった回数をカウント
		
		while(true){
			boolean out = true;
			boolean notover = true;
			ArrayList<Integer> indexs = new ArrayList<Integer>();		//
			ArrayList<Integer> overindexs = new ArrayList<Integer>();	//if文を満たさない連続した箱（重複している箱）の最初の箱の番号
			
			boolean overing = false;
			for(int i = 1; i < nums.length; i++){
				if(nums[i]+nums[i-1] > x){
					out = false;
					indexs.add(i);
					
					if(nums[i] != 0){
						
						//ここに連続してきていないなら
						if(i != nums.length-1 && notover){
							overing = true;
							overindexs.add(i);
							notover = false;
						}
					}
				}else{
					notover = true;
					if(overing){
						overing = false;
						overindexs.add(i-1);
					}
				}
			}
			
			if(overing)	overindexs.add(nums.length-1);
			if(out)	break;
			
			for(int i = 0; i < overindexs.size(); i += 2){
				int difference = overindexs.get(i+1) - overindexs.get(i);
				if(difference >=3){
					for(int j = 0; j < difference-2; j++){
						if(j % 2 == 0){
							nums[overindexs.get(i)+j]--;
							count++;
						}
						
						//indexsから同じ箱を指しているものを探す
						for(int k = 0; k < indexs.size(); k++)
							if(indexs.get(k) == overindexs.get(i)+j)	indexs.remove(k);
					}
				}else{
					for(int j = overindexs.get(i); j <= overindexs.get(i+1); j++){
						if(overindexs.size() != j){
							nums[j]--;
							count++;
						}
						
						for(int k = 0; k < indexs.size(); k++)
							if(indexs.get(k) == j)		indexs.remove(k);
					}
				}
			}
			
			for(int i = 0; i < indexs.size(); i++){
				if(!numserased[indexs.get(i)]){
					nums[indexs.get(i)]--;
					if(nums[indexs.get(i)-1] != 0) numserased[indexs.get(i)] = true;
				}else{
					nums[indexs.get(i)-1]--;
					numserased[indexs.get(i)] = false;
				}
				count++;
				indexs.remove(i);
			}
		}
		
		System.out.println(count);
	}
}