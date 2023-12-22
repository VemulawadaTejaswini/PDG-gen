import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static int binarysearch(int[] S,int search){
        int len=S.length;
        int left=0;
        int right=S.length-1;
        while(len>1){
            if(search<=S[(right+left)/2]){
                right=(right+left)/2;
                len=right-left+1;
            }
            else{
                left=(right+left)/2+1;
                len=right-left+1;
            }
        }
        return S[right]==search ? 1 : 0;
    }
    public static void main(String[] args){
        int ans=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] S=new int[n];
        for(int i=0;i<n;i++){
            S[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int[] T=new int[q];
        for(int i=0;i<q;i++){
            T[i]=sc.nextInt();
        }
        Arrays.sort(T);
        for(int i=0;i<q;i++){
            ans+=binarysearch(S,T[i]);
        }
        System.out.println(ans);
    }
}

