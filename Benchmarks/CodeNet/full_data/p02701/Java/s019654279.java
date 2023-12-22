import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int i=0;
        int count=1;
        String S[]=new String[N];
        int k=0;
        for(i=0;i<N;i++){
            S[i]=sc.next();
        }
        Arrays.sort(S);
        for(i=0;i<(N-1);i++){
            if(!(S[i].equals(S[i+1])))
                count++;
        }
        System.out.println(count);
    }
}