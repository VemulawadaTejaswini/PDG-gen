import java.util.*;

public class Main {

    static int[][] info = new int[200000][3];

    static int N,M;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String NM = sc.nextLine();
        String[] nm = NM.split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);
        for(int i=0;i<M;i++) {
            String LRD = sc.nextLine();
            String[] lrd = LRD.split(" ");
            int a=Integer.parseInt(lrd[0]);
            int b=Integer.parseInt(lrd[1]);
            int c=Integer.parseInt(lrd[2]);
            if(a<b){
                info[i][0]=a;
                info[i][1]=b;
                info[i][2]=c;
            }else{
                info[i][0]=b;
                info[i][1]=a;
                info[i][2]=-c;
            }
        }



        for(int i=0;i<M;i++){
            if(!verify(info[i][0],info[i][1],info[i][2],0)){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }

    public static boolean verify(int i, int j, int target, int calc){
        if(i==j){
            if(target==calc){
                return true;
            }else return false;
        }

        for(int a=0;a<M;a++){
            if(info[a][0]==i){
                if(!verify(info[a][1],j,target,calc+info[a][2])){
                    return false;
                }
            }
        }

        return true;

    }
}
