import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Long> A = new ArrayList<>();
        for(int i=0;i<N;i++) A.add(sc.nextLong());

        for(int i=0;i<A.size()-1;i++){
            if(i<A.size()-2&&A.get(i)<0) {
                A.set(i, A.get(i) * (-1));
                A.set(i + 1, A.get(i + 1) * (-1));
            }
            else if(i==A.size()-2){
                if(A.get(i)<=0&&A.get(i+1)<=0){
                    A.set(i, A.get(i) * (-1));
                    A.set(i + 1, A.get(i + 1) * (-1));
                }
                else if(A.get(i)<0&&A.get(i+1)>0){
                    long num = A.get(i)*(-1);
                    if(num>=A.get(i+1)){
                        A.set(i, A.get(i) * (-1));
                        A.set(i + 1, A.get(i + 1) * (-1));
                    }
                }
                else if(A.get(i)>0&&A.get(i+1)<0){
                    long num = A.get(i+1)*(-1);
                    if(num>=A.get(i)){
                        A.set(i, A.get(i) * (-1));
                        A.set(i + 1, A.get(i + 1) * (-1));
                    }
                }
            }
        }
        long opt =0;
        for(long i:A)opt+=i;
        System.out.println(opt);
    }
}
