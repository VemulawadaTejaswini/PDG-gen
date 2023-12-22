import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // room#
		int M = sc.nextInt(); // path#

		Integer[][] pp = new Integer[M][2];
		
		for(int i=0; i<M; i++){
			int tmp1 = sc.nextInt();
			int tmp2 = sc.nextInt();
			
			if(tmp1<tmp2){
				pp[i][0] = tmp1;
				pp[i][1] = tmp2;
			}else{
				pp[i][0] = tmp2;
				pp[i][1] = tmp1;
			}
		}
      
      	Integer[] ans = new Integer[N];
      	for(int i=0; i<N; i++){
			ans[i] = 0;
		}
		ans[0] = 1;

		// function
		for(int j=1; j<N; j++){
			for(int i=0; i<M; i++){
				int tmp1 = pp[i][0];
				if(tmp1 == j){
					int tmp2 = pp[i][1];
                  	if(ans[tmp2-1]==0){
                      ans[tmp2-1] = tmp1;
                    }
				}
			}
		}
      
      	for(int j=1; j<N; j++){
          	if(ans[j] == 0){
              for(int i=0; i<M; i++){
                  if(pp[i][0] == j){
                      ans[j] = pp[i][1];
                  }
              }
            }
		}

		for(int i=0; i<N; i++){
			if(ans[i] == 0){
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
		for(int i=1; i<N; i++){
			System.out.println(ans[i]);
		}
		return;

	}
}