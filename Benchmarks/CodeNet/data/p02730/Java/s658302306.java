//Atcoder160A 配列の比較
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		 String S = sc.next();
      	 int N=S.length;
      for(int i=0;i<(N-1)/2;i++)
        if(S.charAt(i) == S.charAt(N-1-i)&&S.charAt(i) == S.charAt((N-1)/2-1-i)&&S.charAt(N-i) == S.charAt((N-1)/2+1+i)){
        System.out.println("Yes");}
      	else{
        System.out.println("No");}}
	}
}
