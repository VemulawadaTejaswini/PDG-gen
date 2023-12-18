import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    	//int M = sc.nextInt();
      	//String S = sc.next();
      	//int list[] = new int[N];
      	//for(int i=0;i<N;i++){
        //	list[i] = sc.nextInt();
        //}
      	//Arrays.sort(list);
      	for(int i=0;i<100000000;i++){
        	if(N%2==0 && i%2==0){
              	System.out.println(i);
            	break;
            }
        }
      	
    }
}