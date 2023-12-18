import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();

        char[] cha = S.toCharArray();

        int score = 0;
        char left = 'n';
        char here = 'n';
        char right = 'n';
        for(int i=0; i<N; i++){
            if(i==0){
                left = 'n';
                here = cha[i];
                right= cha[i+1];
            }else if(i==(N-1)){
                left = cha[i-1];
                here = cha[i];
                right = 'n';
            }else{
                left = cha[i-1];
                here = cha[i];
                right= cha[i+1];
            }
            
            if(here=='L' && left=='L'){
                score +=1;
            }
            if(here=='R' && right=='R'){
                score +=1;
            }
        }

        for(int i=0; i<K; i++){
            score = Math.min(score +2, N);
        }
        System.out.println(score);
    }
}