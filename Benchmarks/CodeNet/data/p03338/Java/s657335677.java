import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int[] countl = new int[26];
        int[] countr = new int[26];
        int ans = 0;
        int max = 0;
        
        for(int i=1; i<str.length(); i++){
            for(int j=0; j<i; j++){
                if(countl[str.charAt(j)-97]==0){
                    countl[str.charAt(j)-97]++;
                    //System.out.println(i+"j"+j);
                }
            }
            for(int k=i; k<str.length(); k++){
                if(countr[str.charAt(k)-97]==0){
                    countr[str.charAt(k)-97]++;
                    //System.out.println(i+"k"+k);
                }
            }
            for(int l=0; l<26; l++){
                ans = ans + countl[l]*countr[l];
                //System.out.println(l+":"+countl[l]+":"+countr[l]);
                if(ans > max){
                    max = ans;
                    //System.out.println("max"+max);
                }
            }
            ans = 0;
            for(int j=0; j<i; j++){
                countl[str.charAt(j)-97]=0;
                //System.out.println(i+"j"+j);
            }
            for(int k=i; k<str.length(); k++){
                countr[str.charAt(k)-97]=0;
                //System.out.println(i+"k"+k);
            }
        }
        System.out.println(max);
    }
}