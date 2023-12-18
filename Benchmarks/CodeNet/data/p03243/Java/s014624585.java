import java.util.Scanner;

class Main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[]){
        int n=scan.nextInt();
        boolean bool=false;
        int ans;
        for(int i=n;true;i++){
            String s=Integer.toString(i);
            bool=false;
            for(int j=0;j+1<s.length();j++){
                if(s.charAt(j)!=s.charAt(j+1)){
                    bool=true;
                    break;
                }
            }    
            if(!bool){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}