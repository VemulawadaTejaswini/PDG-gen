import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
      	int n = scn.nextInt();
		int[] p = new int[n];
		for(int i=0; i<n; i++){
			p[i] = scn.nextInt();
		}
      	int ans = x;
      	int num = x;
      	for(int i=0; i<n; i++){
          if(ans==p[i]){
            ans++;
            i=-1;
          }
        }
      	for(int i=0; i<n; i++){
          if(num==p[i]&&ans>0){
            num--;
            i=-1;
          }
        }
      	if(Math.abs(ans-x)>=Math.abs(num-x)) {
		System.out.println(num);
		}else {
			System.out.println(ans);
		}
	}
}
