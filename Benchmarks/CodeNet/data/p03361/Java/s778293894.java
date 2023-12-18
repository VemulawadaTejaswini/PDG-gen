import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};
        chat map[][] = new char[n][m];
        for(int i=0; i<n; i++){
            map[n] = sc.nextLine().toCharArray();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]=='#'){
                    for(int k=0; k<4; k++){
                        boolean ans = false;
                        if(i+dx[k]>=0 && i+dx[k]<m && j+dy[k]>=0 && j+dy[k]<n){
                            if(map[i+dx[k]][j+dy[k]]=='#'){
                                ans = true;
                            }
                            if(ans){
                                break;
                            }
                            if(k==3){
                                System.out.println("No");
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Yes");
        
    }
}
