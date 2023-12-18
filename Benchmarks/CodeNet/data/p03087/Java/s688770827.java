import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int q = sc.nextInt();
      char[] c = sc.next().toCharArray();
      int[] l = new int[q];
      int[] r = new int[q];
      for(int i = 0;i < q;i++){
      	l[i]=sc.nextInt();
        r[i]=sc.nextInt();
      }
      int cnt = 0;
      for(int i = 0;i < q;i++){
      	for(int j = l[i];j <= r[i]-1;j++){
        	if(c[j-1]=='A'&&c[j]=='C')cnt++;
        }
        System.out.println(cnt);
        cnt = 0;
      }
    }
}