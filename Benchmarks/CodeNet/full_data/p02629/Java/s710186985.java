public class Main {
    public static void main(String[] args){
        int n=new java.util.Scanner(System.in).nextInt();
        String ans="";
        String alp="abcdefghijklmnopqrstuvwxyz";
        for(;;){
            int x=(int)Math.floor(n/26);
            int y=n-x*26;
            n=x;
            ans=alp.charAt(y-1)+ans;
            if(n==0)break;
        }
        System.out.println(ans);
    }
}