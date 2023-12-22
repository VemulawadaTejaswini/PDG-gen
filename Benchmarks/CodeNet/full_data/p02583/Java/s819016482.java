import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer a[] = new Integer[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
      	int ans = 0;
        
      	for(int i=0; i<N-2; i++){
          for(int j=i+1; j<N-1; j++){
            for(int n=j+1; n<N; n++){
              if(a[i]+a[j]>a[n] && a[j]+a[n]>a[i] && a[n]+a[i]>a[j] && a[i] != a[j] && a[j] != a[n] && a[n] != a[i]) {
                //System.out.println(a[i]+a[j]);
			  	ans++;
			  }
          	}
          }
        }
      	System.out.println(ans);
    }
}

