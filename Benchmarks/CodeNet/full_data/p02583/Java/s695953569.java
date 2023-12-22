import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	if(N<3){
			System.out.println(0);
			return;
		}
		Integer[] Ni = new Integer[N];

		for(int i = 0; i<N; i++){
			Ni[i]=sc.nextInt();
		}

		int cnt = 0;

		for(int i = 0; i<N; i++){
			for(int j = i+1; j<N; j++){
				for(int k = j+1; k<N; k++){
					if(makeTri(Ni[i],Ni[j],Ni[k])){
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
		return;
	}
	public static boolean makeTri(int i1, int i2, int i3){

		if((i1==i2)||(i1==i3)||(i2==i3)){
			return false;
		}

		if((i1>i2)&&(i1>i3)){
			if(i1>=i2+i3){
				return false;
			}
		}

		if((i2>i1)&&(i2>i3)){
			if(i2>=i1+i3){
				return false;
			}
		}

		if((i3>i1)&&(i3>i2)){
			if(i3>=i1+i2){
				return false;
			}
		}
		
		return true;
	}
}
