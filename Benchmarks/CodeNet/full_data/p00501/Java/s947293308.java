import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int i,j,k,l,diff,cnt = 0,flag = 0;
	int n = sc.nextInt();                                                                                                                                                                                                                             
	char[] target = sc.next().toCharArray();
	char[][] old = new char[n][];
	
	void doIt2(){
n1:		for(k = 0; k < old[i].length; k ++ ){
			if(target[0] == old[i][k]){
				for(j = k + 1; j < old[i].length; j ++ ){				
					if(target[target.length-1] == old[i][j]){
						if((j - k) % (target.length-1) != 0)continue;
						diff = (j - k) / (target.length-1);
						flag = 2;
						for(l = 1; l <= target.length-1; l ++ ){
							if(target[l] == old[i][k + l * diff]){
								flag ++;
								if(flag == target.length){
									cnt ++;
									break n1;
								}
							}
							else break;
						}
					}
				}
			}
		}
	}
	
	void doIt(){
		for(i = 0; i < n; i ++ ){
			old[i] = sc.next().toCharArray();
			doIt2();
		}
		System.out.println(cnt);
	}
	
	public static void main(String args[]){
		new Main().doIt();
	}
}