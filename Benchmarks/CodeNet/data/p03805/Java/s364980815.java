import java.util.*;
public class Main {

	//最終的にはなくしたい、finalじゃないstatic変数は大体不要
	static int ans = 0;

	public static void main(String[] args){
  
  		boolean[][] array2 = getArray2();
  
      	boolean[] pathArray = new boolean[array2[0].length];
        pathArray[0] = true;
      	makePathArray(0, pathArray, array2);
      	System.out.println(ans);
	}
  
  	public static boolean[][] getArray2() {
      	Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		boolean[][] array2 = new boolean[N][N];

  
		for(int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();

			//0から始まるから、1ずれる
			array2[a - 1][b - 1] = true;
			array2[b - 1][a - 1] = true;
		}
      
      	return array2;
    }

	public static void makePathArray(
			int currentNum, boolean[] pathArray, boolean[][] array2){
      
      	int N = array2[0].length;

		for(int i = 0; i < N; i++){
			if(array2[currentNum][i] == false) {
				continue;
			}
			if(isAllTrue(pathArray) && pathArray[i]){
				ans = ans + 1;
			} else if(pathArray[i] == false){
				pathArray[i] = true;
				makePathArray(i, pathArray, array2);
			}
          	if(i == N){
            	pathArray[currentNum] = false;
              	makePathArray(currentNum, pathArray, array2);
            }
		}
	}
  
  	public static boolean isAllTrue(boolean[] pathArray){
      	for(boolean isThrough : pathArray){
          	if(isThrough == false) {
              	return false;
            }
        }
      	return true;
    }
}