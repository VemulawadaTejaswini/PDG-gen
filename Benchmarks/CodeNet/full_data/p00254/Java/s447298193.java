import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class MAIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L=0,S=0,j=0,cnt=0,ksan,ksan2;
		Integer[] le = new Integer[4];
		Integer[] se = new Integer[4];
		ksan = sc.nextInt();
		if(ksan==1111||ksan==2222||ksan==3333||ksan==4444||ksan==5555||ksan==6666||ksan==7777||ksan==8888||ksan==9999){
			System.out.println("NA");
			ksan = sc.nextInt();
		}else if(ksan == 6174){
			System.out.println(0);
			ksan = sc.nextInt();
		}
		while(ksan != 0000){
			if(ksan == 6174){
				System.out.println(cnt);
				ksan = sc.nextInt();
			}else if(ksan==1111||ksan==2222||ksan==3333||ksan==4444||ksan==5555||ksan==6666||ksan==7777||ksan==8888||ksan==9999){
				System.out.println("NA");
				ksan = sc.nextInt();
			}else{
				ksan2 = ksan;
				for(int a=1000;a>=1;a = a/10){
					ksan2 = ksan/a;
					le[j] = ksan2;
					se[j] = ksan2;
					ksan = ksan - le[j]*a;
					j++;
				}
				Arrays.sort(le,Collections.reverseOrder());
				Arrays.sort(se);
				int bai = 1000;
				for(int b=1;b<=4;b++){
					L = L + le[b-1] * bai;
					S = S + se[b-1] * bai;
					bai = bai/10;
				}
			ksan = L-S;
			L = 0;
			S = 0;
			j=0;
			cnt++;
			}
		}
	}
}