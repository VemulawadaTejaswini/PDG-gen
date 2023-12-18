import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int p = sc.nextInt();
      	int q = sc.nextInt();
      	int r = sc.nextInt();
      
      	int[] hoge = {p, q, r};
      	Array.sort(hoge);
      	System.out.println(hoge[0] + hoge[1]);
    }
}