import java.util.Arrays;
import java.util.Scanner;


public class Main {
	int[] list;
	boolean[] used;
	final int target = 10;
	String str;
	final char[] op = {'+', '-', '*'};
	int cal(final int a, final int b, char key){
		int sum = 0;
		switch(key){
		case '+':
			sum = a+b;
			break;
		case '-':
			sum = a-b;
			break;
		case '*':
			sum = a*b;
			break;
		default:
		}
		return sum;
	}
	
	boolean solve(int sum, int depth, String str){
		if(depth==list.length){
			if(sum==target){ 
				this.str = str; 
			}
			return sum==target;
		}
		boolean flag = false;
		
		if(str==""){
			for(int i=0; i<list.length; ++i){
				used[i] = true;
				flag |= solve(list[i], depth+1, Integer.toString(list[i]));
				used[i] = false;
			}
		}else{
			for(int i=0; i<used.length; ++i){
				if(!used[i]){
					used[i] = true;
					for(int j=0; j<op.length; ++j){
						String tmp = "(" + str + " " + op[j] + " " + list[i] + ")";
						flag |= solve(cal(sum, list[i], op[j]), depth+1, tmp);
					}
					used[i] = false;
				}
			}
			
			if(depth==2){
				for(int i=0; i<list.length; ++i){
					if(!used[i]){
						used[i] = true;
						for(int j=0; j<list.length; ++j){
							if(!used[j]){
								used[j] = true;
								for(int k=0; k<op.length; ++k){
									final int sum2 = cal(list[i], list[j], op[k]);
									for(int l=0; l<op.length; ++l){
										String tmp = "(" + str + " " + op[l] + "(" + list[i] + " " + op[k] + " " + list[j] + ")";
										flag |= solve(cal(sum, sum2, op[l]), depth+2, tmp);
									}
								}
								used[j] = false;
							}
						}
						used[i] = false;
					}
				}
			}
			
		}
		
		return flag;
	}
	
	
	void io(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			list = new int[4];
			int sum = 0;
			for(int i=0; i<4; ++i){
				list[i] = sc.nextInt();
				sum += list[i];
			}
			if(sum==0)break;
			used = new boolean[4];
			str = "";
			solve(0, 0, "");
			System.out.println(str=="" ? 0 : str);
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
	
	void debug(Object... os){
		System.out.println(Arrays.deepToString(os));
	}
}