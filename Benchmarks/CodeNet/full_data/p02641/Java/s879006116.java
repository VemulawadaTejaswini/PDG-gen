import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int X = sn.nextInt();
        int N = sn.nextInt();
        List<Integer> pList = new ArrayList<>();

        if(N == 0) System.out.println(X);
        else{
            for(int i=0; i<N; i++){
                pList.add(sn.nextInt());
                }

            Arrays.asList(pList);
            int u_i = X;
            int d_i = X;

            while(true){
                if(!pList.contains(u_i) && !pList.contains(d_i)){
                    System.out.println(d_i);
                    break;
                }
                else if(!pList.contains(u_i)){
                    System.out.println(u_i);
                    break;
                }
                else if(!pList.contains(d_i)){
                    System.out.println(d_i);
                    break;
                }

                u_i++;
                d_i--;
            }
        }
    }
}