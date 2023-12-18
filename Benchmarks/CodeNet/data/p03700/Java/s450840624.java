

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new ABC_4().start();
	}
	int a,b;
	int[] hp;
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        hp = new int[n];
        for(int i = 0; i < n; i++){
        	hp[i] = in.nextInt();
        }
        int count = 0;

        int attackDist = a - b;
        while(getMax(hp) > 0){
        	int dist = getMax(hp) - getNextMax(hp);
        	if(dist < attackDist){
        		attack(getMaxIndex(hp));
        		count++;
        	}else{
        		int attackCount = 0;
        		if(dist % attackDist == 0){
        			attackCount = dist / attackDist;
        		}else{
        			 attackCount = dist / attackDist + 1;
        		}
        		multAttack(getMaxIndex(hp),attackCount);
        		count += attackCount;
        	}
        }
        System.out.println(count);
        in.close();
	}
	int getMaxIndex(int[] a){
		int max = Integer.MIN_VALUE;
		int index = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
				index = i;
			}
		}
		return index;
	}
	int getMax(int[] a){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		return max;
	}
	int getNextMax(int[] a){
		int max = a[0];
		int nextmax = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				nextmax = max;
				max = a[i];
			}else if(a[i] > nextmax){
				nextmax = a[i];
			}
		}
		return nextmax;
	}
	void attack(int index){
		for(int i = 0; i < hp.length; i++){
			if(index == i) hp[i] -= a;
			else hp[i] -= b;
		}
	}
	void multAttack(int index, int count){
		for(int i = 0; i < hp.length; i++){
			if(index == i) hp[i] -= a * count;
			else hp[i] -= b * count;
		}
	}

}
