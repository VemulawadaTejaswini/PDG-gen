import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] ch=sc.next().toCharArray();
        sc.close();
        int n=ch.length;
        String ans;
        if(ch[0]==ch[n-1]){
            ans=n%2==0?"First":"Second";
        } else{
            ans=n%2==0?"Second":"First";
        }
        System.out.println(ans);
    }
}
