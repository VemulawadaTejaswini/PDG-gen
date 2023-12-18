import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String s=scn.next();
        int w_cnt=0;
        int b_cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='#'){
                b_cnt++;
            }else if(s.charAt(i)=='.'){
                w_cnt++;
            }
        }
        if(b_cnt<w_cnt){
            System.out.println(b_cnt);
        }else{
            System.out.println(w_cnt);
        }
    }
    
}
