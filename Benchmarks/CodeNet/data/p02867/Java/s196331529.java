import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        int [][] AB = new int[N][2];
        for(int i=0;i<N;i++){
            int num  =sc.nextInt();
            A.add(num);
            AB[i][0]=num;
        }
        for(int i=0;i<N;i++) {
            int num  =sc.nextInt();
            B.add(num);
            AB[i][1]=num;
        }
        int opt = 0;
        Collections.sort(B);
        for(int i=0;i<N;i++){
            if(A.get(i)>B.get(i)){
                boolean check = false;
                for(int j=i+1;j<N;j++){
                    if(A.get(j)<=B.get(j)){
                        int a = A.get(i);
                        A.set(i,A.get(j));
                        A.set(j,a);
                        check = true;
                        if(AB[j][1]!=B.get(i))opt++;
                        break;
                    }
                }
                if(!check){
                    opt = N;
                    break;
                }
            }
        }
        if(opt<=N-2) System.out.println("Yes");
        else System.out.println("No");
    }
}