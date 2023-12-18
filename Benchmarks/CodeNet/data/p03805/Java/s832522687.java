import java.util.*;
public class Main {
  
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
      
      	connectingNumsArray2 = new boolean[N][N];
        for(i = 0; i < N; i++){
            for(j = 0; j < N; j++){
                // 初期値はfalse
                connectingNumsArray2[i][j] = false;
            }
        }
		
      	for(i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
          
          	connectingNumsArray2[a][b] = true;
            connectingNumsArray2[b][a] = true;
        }
      
        List<Integer> pathList = new ArrayList<>();
      	pathList.add(1);
      	int ans = 0;
      	makePathList(1, pathList);
      
        system.out.println(ans);
    }
  
  	public static void makePathList(int currentNum, List<Integer> pathList){
        for(boolean[] nextNumCandidate : connectingNumsArray2){
            for(i = 0; i < N; i++){
                if(nextNumCandidate[i] == false){
                    if(pathList.length == N - 1){
                        ans = ans + 1;
                    }
                } else {
                    pathList.add(i + 1);
                    makePathList(i + 1, pathList);
                }
              
            }
        }
    }
}
