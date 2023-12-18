import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int[] ans=new int[n];
        for(int i=0;i<26;i++){
            if(s.contains(Character.toString((char)(97+i)))){
                ans[s.indexOf((char)(97+i))]++;
                ans[s.lastIndexOf((char)(97+i))]--;
            }
        }
        int finalans=ans[0];
        for(int i=1;i<n;i++){
            finalans=Math.max(finalans,ans[i]+=ans[i-1]);
        }
        System.out.println(finalans);

    }
}