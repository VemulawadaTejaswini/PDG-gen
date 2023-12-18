import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        String str[] = new String[h];
        for (int i=0; i<h; i++){
            str[i] = sc.next();
        }

        char point[][] = new char[h][w];

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                point[i][j] = str[i].charAt(j);
            }
        }

        int count = 0;

        int max_count[] = new int[h*w];

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                count = 0;
                if (point[i][j]=='.'){
                    for (int k=i-1; 0<=k; k--){
                        count++;
                        if(point[i][k]=='#'){
                            break;
                        }
                    }

                    for (int l=i+1; l<w; l++){
                        count++;
                        if (point[i][l]=='#'){
                            break;
                        }
                    }

                    for (int m=i-1; 0<=m; m--){
                        count++;
                        if (point[m][j]=='#'){
                            break;
                        }
                    }

                    for (int n=i+1; n<h; n++){
                        count++;
                        if (point[n][j]=='#'){
                            break;
                        }
                    }
                }
                max_count[i*j]=count;
            }
        }
        for (int i=0; i<h*w; i++){
            count = Math.max(count, max_count[i]);
        }
        System.out.println(count + 1);

    }
}
