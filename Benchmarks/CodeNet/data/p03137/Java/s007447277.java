import java.util.*;

 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int K = sc.nextInt();
		int M = sc.nextInt();
		int[] p = new int[M];
        int[] mas = new int[M-1];
		for (int i=0;i<M;i++){
			p[i]=sc.nextInt();
		}
		Arrays.sort(p);
      
      for(int i =0;i<M-1;i++){
        mas[i]=Math.abs(p[i+1]-p[i]);
      }
      Arrays.sort(mas);
      
      int nam = M-K;
      int ans = 0;
      if(M-K>0){
      for(int i=0;i<nam;i++){
        ans = ans+mas[i];
      }
		System.out.print(ans);
      }else{
        System.out.print(ans);
      }
	}
}