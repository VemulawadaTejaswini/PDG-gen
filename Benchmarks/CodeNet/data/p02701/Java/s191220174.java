import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int i=1;
        int count=0;
        String[] S=new String[N];
        int k=0;
        for(i=0;i<N;i++) S[i]=sc.next();
        Arrays.sort(S);
        for(i=1;i<N;i++) if(S[i]!=S[i-1]) count++;
        System.out.println(count);
        }
        
    }