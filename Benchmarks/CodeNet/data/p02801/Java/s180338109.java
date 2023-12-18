import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int M = sc.nextInt();		

      int[]list  = new int[N-1];
		int all = 0;
		for(int i=0; i<N-1; i++){
			list[i] = sc.nextInt();
			all += list[i];
}
		int want = N*M;
        if(want-all>=0 && want-all<=K){
          System.out.println(want-all);
        }else if(want-all<0){
          System.out.println("0");          
        }else{
		System.out.println("-1");
	}
}
}