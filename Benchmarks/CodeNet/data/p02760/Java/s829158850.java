import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        int[][] A=new int[3][3];
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                A[j][i]=scanner.nextInt();
            }
        }
        n=scanner.nextInt();
        HashSet<Integer> hashSet=new HashSet<>();
        for(int j=0;j<n;j++){
            int ss=scanner.nextInt();
            hashSet.add(ss);
        }
        int ff=0;
        for(int j=0;j<3;j++){
            int is=0;
            for(int i=0;i<3;i++){
                if(hashSet.contains(A[j][i])){
                    is++;
                }

            }
            if(is==3){
                ff=1;
                break;
            }
        }
        if(ff==1){
            System.out.println("Yes");
        }
        else{
            for(int j=0;j<3;j++){
                int is=0;
                for(int i=0;i<3;i++){
                    if(hashSet.contains(A[i][j])){
                        is++;
                    }
                }
                if(is==3){
                    ff=1;
                    break;
                }
            }
            if(ff==1){
                System.out.println("Yes");
            }
            else{
                int aa=A[0][0];
                int bb=A[1][1];
                int cc=A[2][2];
                if(hashSet.contains(aa) && hashSet.contains(bb) && hashSet.contains(cc)){
                    System.out.println("Yes");
                }
                else{
                    aa=A[0][2];
                    bb=A[1][1];
                    cc=A[2][0];
                    if(hashSet.contains(aa) && hashSet.contains(bb) && hashSet.contains(cc)){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                }
            }
        }
    }
}
