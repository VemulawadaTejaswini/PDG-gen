import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        ArrayList<Integer> R=new ArrayList<>();
        ArrayList<Integer> G=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')
                R.add(i);
            else if(s.charAt(i)=='G')
                G.add(i);
            else{
                B.add(i);
            }
        }
        int ans=R.size()*G.size()*B.size();
        for (int i=0;i<R.size();i++){
            for(int j=0;j<G.size();j++){
                for(int k=0;k<B.size();k++){
                    int a=R.get(i);
                    int b=G.get(j);
                    int c=B.get(k);
                    int min=Math.min(a,Math.min(b,c));
                    int max=Math.max(a,Math.max(b,c));
                    int mid=0;
                    if(a!=min && a!=max)
                        mid=a;
                    else if(b!=min && b!=max)
                        mid=b;
                    else
                        mid=c;
                    if(max-mid==mid-min)
                        ans--;
                }
            }
        }
        System.out.println(ans);
    }
}
