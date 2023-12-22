import java.util.*;

public class Main{

    String[][] set,color;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            set = new String[n][6];
            color = new String[n][4];
            int cnt = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<6; j++) set[i][j] = sc.next();
                getColor(i);
                for(int j=0; j<i; j++){
                    boolean same = false;
                    for(int k=0; k<4; k++){
                        for(int l=0; l<4; l++){
                            if(!color[i][l].equals(color[j][(l+k)%4])){
                                same = false;
                                break;
                            }
                            same = true;
                        }
                        if(same) break;
                    }
                    if(same){
                        cnt++;
                        break;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    void getColor(int idx){
        int num = 0;
        for(int i=0; i<6; i++){
            if(set[idx][i].equals("Cyan")) num = i;
        }

        if(num==0){
            color[idx][0] = set[idx][1];
            color[idx][1] = set[idx][2];
            color[idx][2] = set[idx][4];
            color[idx][3] = set[idx][3];
        }else if(num==1){
            color[idx][0] = set[idx][5];
            color[idx][1] = set[idx][2];
            color[idx][2] = set[idx][0];
            color[idx][3] = set[idx][3];
        }else if(num==2){
            color[idx][0] = set[idx][1];
            color[idx][1] = set[idx][5];
            color[idx][2] = set[idx][4];
            color[idx][3] = set[idx][0];
        }else if(num==3){
            color[idx][0] = set[idx][1];
            color[idx][1] = set[idx][0];
            color[idx][2] = set[idx][4];
            color[idx][3] = set[idx][5];
        }else if(num==4){
            color[idx][0] = set[idx][0];
            color[idx][1] = set[idx][2];
            color[idx][2] = set[idx][5];
            color[idx][3] = set[idx][3];
        }else if(num==5){
            color[idx][0] = set[idx][1];
            color[idx][1] = set[idx][3];
            color[idx][2] = set[idx][4];
            color[idx][3] = set[idx][2];
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}