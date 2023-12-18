import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int cnt = 700;
		String S = sc.next();
      	String a[] = S.split();
      	for(int i=0;i<3;i++){
        	if(a[i].equals("o")){
            	cnt += 100;
            }
        }
      	System.out.println(cnt);
      
      	
    }
}