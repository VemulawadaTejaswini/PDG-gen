import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] moji = s.toCharArray();
        int cnt =0;
        int[] moji2 = new int[s.length()];

        for(int i = 0;i<moji.length;i++){
            moji2[i]=(int)moji[i];
        }

        Arrays.sort(moji2);

        for(int i=0;i<moji2.length-1;i++){
            if(moji2[i]+1!=moji2[i+1] && moji2[i]!=moji2[i+1]){
                //System.out.println(moji2[i]);
                //System.out.println(moji2[i+1]);
                cnt=moji2[i]+1;
                break;
            }
        }
        if(cnt!=0){
        System.out.println((char)cnt);
        }else{
            System.out.println("None");
        }

    }
}


