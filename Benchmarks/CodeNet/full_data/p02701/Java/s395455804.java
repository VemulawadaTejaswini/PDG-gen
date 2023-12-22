import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        String[] S = new String[N];

        for(int i=0; i<N; i++){
            S[i] = sc.next();
        }

        int j,k;
        int count;
        count=N;

        for(j=0; j<N; j++){
            for(k=j+1; k<N; k++){
                if(S[j].equals(S[k])){
                    count-=1;
                    S[k]=String.valueOf(k);
                }
            }
        }

        System.out.print(count);
    }

}