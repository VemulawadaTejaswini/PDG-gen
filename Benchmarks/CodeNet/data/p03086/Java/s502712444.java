import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int max = 0;
		String s2[] = {"A","C","G","T"};
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s2[0].equals(s.substring(i,i+1))){
				count++;
			}else if(s2[1].equals(s.substring(i,i+1))){
				count++;
			}else if(s2[2].equals(s.substring(i,i+1))){
				count++;
			}else if(s2[3].equals(s.substring(i,i+1))){
				count++;
			}else{
				if(count > 0){
					max = Math.max(max,count);
					count = 0;
				}
			}
		}
		System.out.print(max);
	}
}
