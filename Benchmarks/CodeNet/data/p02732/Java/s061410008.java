import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt();
  	int[] a = new int[N];
  	int[] tmp = new int[N];
  	for(int i=0;i<N;i++) a[i] = sc.nextInt();
  	
  	//HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    int cnt = 0;
  	for(int j=1;j<=N;j++){
      for(int l=0;l<N;l++){
        if(a[l] == j) cnt++;
      }
      tmp[j-1] = cnt;
      cnt = 0;
    }
    //System.out.println(Arrays.toString(tmp));
  	int[] ans = new int[N];
	int cnt2;
  	for(int k=1;k<=N;k++){
      tmp[a[k-1]-1]--;
      cnt2 = 0;
      for(int t=0;t<N;t++){
        cnt2 = cnt2 + (tmp[t]*(tmp[t]-1))/2;
      }
      ans[k-1] = cnt2;
      tmp[a[k-1]-1]++;
    }
  	//System.out.println(Arrays.toString(ans));
  	for(int y=0;y<N;y++) System.out.println("" + ans[y]);
}
}
