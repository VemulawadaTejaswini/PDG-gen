import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        String S=sc.next();
        int ans=0;
        for(int i=0;i<N;i++){
            for(int j=(i+1);j<N;j++){
                if(S.charAt(i)!=S.charAt(j)){
                    for(int k=j+1;k<N;k++){
                        if((S.charAt(i)!=S.charAt(k))&&((k-j)!=(j-i))){
                            if(S.charAt(k)!=S.charAt(j)) ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}