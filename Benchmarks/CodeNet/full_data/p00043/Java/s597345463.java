import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String st = input.nextLine();
			boolean[] mati = new boolean[9];
			for(int j = 1 ; j <= 9 ; j++){
				int[] num = new int[14];
				num[0] = j;
				for(int i = 0 ; i < st.length() ; i++){
					num[i+1] = Character.digit(st.charAt(i),10);
				}
				Arrays.sort(num);
				
				String newst = "";
				int count = 0;
				for(int i = 0 ; i < num.length ; i++){
					newst += num[i];
					if(num[i] == j)count++;
				}
				if(count > 4){
					mati[j-1] = false;
				}else{
					mati[j-1] = majhong(newst);
				}
				//System.out.println(mati[j-1]);
			}
			StringBuilder agari = new StringBuilder();
			for(int i = 0 ; i < mati.length ; i++){
				if(mati[i])agari.append((i+1)+" ");
			}
			if(agari.length() != 0){
				System.out.println(agari.substring(0,agari.length()-1));
			}else{
				System.out.println(0);
			}
		}
		input.close();
	}
	
	public static boolean majhong(String st){
		Queue<String> q = new LinkedList<String>();
		q.add(st+","+0);
		while(!q.isEmpty()){
			String[] str = q.poll().split(",");
			String nst = str[0];
			//System.out.println(nst+","+str[1]);
			String makest = "";
			int atama = Integer.parseInt(str[1]);
			int[] nums = new int[nst.length()];
			
			for(int i = 0 ; i < nst.length() ; i++){
				nums[i] = Character.digit(nst.charAt(i),10);
			}
			
			//System.out.println(nst);
			
			//atama
			if(nums.length >= 2){
			
				if(atama != 1 && nums[0] == nums[1]){
					
					for(int i = 2 ; i < nst.length() ; i++){
						makest += nums[i]+"";
					}
					//System.out.println(makest+"aaa");
					if(makest.length() == 0)return true;
					q.add(makest.substring(0,makest.length())+","+1);
				}
				makest = "";
				
				if(nums.length >= 3){
					//anko
					if(nums[0] == nums[1] && nums[1] == nums[2]){
						
						for(int i = 3 ; i < nst.length() ; i++){
							makest += nums[i]+"";
						}
						//System.out.println(makest+"anko");
						if(makest.length() == 0)return true;
						q.add(makest.substring(0,makest.length())+","+atama);
					}
					
					
					//syuntu
					makest = "";
					int nm = nums[0];
					int nmplus_i = -1;
					int nmplustwo_i = -1;
					for(int i = 1 ; i < nst.length(); i++){
						if(nmplus_i == -1 && nums[i] == nm+1){
							nmplus_i = i;
						}
						
						if(nmplustwo_i == -1 && nums[i] == nm+2){
							nmplustwo_i = i;
						}
					}
					
					for(int i = 0 ; i < nst.length() ; i++){
						if(i != 0 && i != nmplus_i && i != nmplustwo_i){
							makest += nums[i]+"";
						}
					}
					if(nmplus_i != -1 && nmplustwo_i != -1){
						//System.out.println("syuntu"+makest+","+nmplus_i+","+nmplustwo_i);
						q.add(makest.substring(0,makest.length())+","+atama);
					}
					if(makest.length() == 0)return true;
				}
			}
		}
		return false;
	}
}