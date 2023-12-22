import java.util.*;

public class Main {
    public static void main(String[] args){
	int n, ba = 0, taihi = 0, zyun = 0;
	String a;
	Scanner scan = new Scanner(System.in);
	while(true){
	    n = scan.nextInt();
	    if(n == 0)break;
	    int[] player = new int[n];
	    for(int b = 0; b < n; b++){
		player[b] = 0;
	    }
	    a = scan.next();
	    char[] hairetu = a.toCharArray();
	    for(int i = 0; i < 100; i++){
		zyun = i % n;
		if(hairetu[i] == 'S'){
		    ba = ba + player[zyun] + 1;
		    player[zyun] = 0;
		}
		if(hairetu[i] == 'L'){
		    player[zyun] = player[zyun] + ba + 1;
		    ba = 0;
		}
		if(hairetu[i] == 'M'){
		    player[zyun] = player[zyun] + 1;
		}
	    }
	    for(int j = 0; j < n - 1; j++){
		for(int k = n - 1; k > j; k-- ){
		    if(player[j] > player[k]){
			taihi = player[j];
			player[j] = player[k];
			player[k] = taihi;
		    }
		}
	    }
	    for(int l = 0; l < n; l++){
		System.out.print(player[l] + " ");
	    }
	    System.out.println(ba);
	    for(int k = 0; k < n; k++){
		player[k] = 0;
	    }
	    ba = 0;
	}
    }
}