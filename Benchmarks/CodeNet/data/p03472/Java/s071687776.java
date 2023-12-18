import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		int a;
		int aMax = 0;
		int[] b = new int[N];
		for(int i=0; i<N; i++){
			a = sc.nextInt();
			b[i] = sc.nextInt();
			aMax = Math.max(aMax,a);
		}

		Arrays.sort(b);
		int bNum=0;
		int bSum=0;
		for(int i=N-1; i>=0; i--){
			if(aMax<b[i]){
				bSum += b[i];
				bNum++;
			}else if(aMax>=b[i]){
				break;
			}
			if(i == 0){
				bNum = N;
			}
		}

		int count = 0;

		if(bSum>=H){
			for(int i=N-1; H>0; i--){
				H -= b[i];
				count ++;
			}
		}else{
			if((H-bSum) % aMax == 0){
				count = bNum + (H-bSum)/aMax;
			}else{
				count = bNum + (H-bSum)/aMax +1;
			}  
		}

		System.out.println(count);
	}	
}
