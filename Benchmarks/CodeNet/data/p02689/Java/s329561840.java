import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tenboudai = sc.nextInt();
		int miti = sc.nextInt();
      	int[] hyoukou = new int[tenboudai];
      	int[][] yoi = new int[tenboudai][miti];
      	int ans = 0;
      	for (int i=0; i<tenboudai; i++){
        	int c = sc.nextInt();
         	hyoukou[i] = c;
        }
      	for (int i=0; i<miti; i++){
          int a = sc.nextInt();
          int b = sc.nextInt();
          yoi[a - 1][i] = b;
        }
      	for (int i=0; i<tenboudai; i++){
          boolean ret = false;
          boolen aa = false;
          for(int j=0; j<miti; j++){
            int x = yoi[i][j] - 1;
          	if (x != 0){
              if (!ret){
                ret = true;
              }
              if(hyoukou[i] > hyoukou[x]){
                aa = true; 
              }else{
                aa = false;
                break;
              }
            }
          }
          if(!ret || aa){
          	ans+=1;
          }
        }
		System.out.println(ans);
	}
}