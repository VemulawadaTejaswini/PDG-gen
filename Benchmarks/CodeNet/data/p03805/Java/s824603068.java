import java.util.*;
public class Main {
  
    static int ans = 0; 
  
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
      
      	boolean[][] connectingNumsArray2 = new boolean[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                // 初期値はfalse
                connectingNumsArray2[i][j] = false;
            }
        }
		
      	for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
          
            //0から始まるから、1ずれる
          	connectingNumsArray2[a - 1][b - 1] = true;
            connectingNumsArray2[b - 1][a - 1] = true;
        }
      
        List<Integer> pathList = new ArrayList<>();
      	pathList.add(1);
      	makePathList(1, pathList, N, connectingNumsArray2);
    }
  
  	public static void makePathList(
        int currentNum, List<Integer> pathList,int N, boolean[][] connectingNumsArray2){
            for(int i = 0; i < N; i++){
                if(connectingNumsArray2[currentNum - 1][i] == false) {
                    continue;
                }

                if(pathList.size() == N && pathList.contains(i + 1)){
                     ans = ans + 1;
                } else if(pathList.contains(i + 1) == false){
                    pathList.add(i + 1);
                    System.out.println(pathList);
                    makePathList(i + 1, pathList, N, connectingNumsArray2);
                } 
         }
    }
}
